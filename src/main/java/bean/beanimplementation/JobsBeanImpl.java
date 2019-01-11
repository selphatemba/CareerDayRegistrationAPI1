package bean.beanimplementation;

import bean.beanInterface.JobsbeanI;
import dao.daoimplementation.DaoIAnnotation;
import dao.daointerface.DaoI;
import models.Job;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static dao.daoimplementation.DaoIAnnotation.User.JOB;

public class JobsBeanImpl implements JobsbeanI {
    @Autowired
    @DaoIAnnotation(choice =JOB)
     private DaoI daoI;

    @Override
    public boolean register(Job job) {
        return daoI.create(job);
    }

    @Override
    public boolean edit(Job job) {
        try {
            daoI.update(job);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean findById(Job job) {
        return false;
    }

    @Override
    public boolean remove(Job job) {
        return false;
    }

    @Override
    public List<Job> findAllJobs() {
        return null;
    }


}
