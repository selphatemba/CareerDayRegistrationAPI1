package bean.beanimplementation;

import bean.beanInterface.JobApplicantbeanI;
import dao.daoimplementation.DaoIAnnotation;
import dao.daointerface.DaoI;
import models.JobApplicant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import javax.ejb.EJB;
import java.util.List;

import static dao.daoimplementation.DaoIAnnotation.User.JOBAPPLICANT;
/*
A managed Bean to carry out all job applicant's operations
* */
public class JobApplicantbeanImpl implements JobApplicantbeanI {
    @EJB
    @DaoIAnnotation(choice =JOBAPPLICANT)
    private DaoI daoI;

    @Override
    public boolean register(JobApplicant ja) {
        return daoI.create(ja);
    }

    @Override
    public boolean edit(JobApplicant ja) {
        try {
            daoI.update(ja);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;

    }

    @Override
    public boolean findById(JobApplicant ja) {
        return false;
    }

    @Override
    public boolean remove(JobApplicant ja) {
        return false;
    }

    @Override
    public List<JobApplicant> findAllJobApplicants() {
        return null;
    }




}
