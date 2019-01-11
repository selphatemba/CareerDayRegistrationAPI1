package dao.daoimplementation;

import dao.daointerface.DaoI;
import models.JobApplicant;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import java.util.List;

import static dao.daoimplementation.DaoIAnnotation.User.JOBAPPLICANT;

@RequestScoped
@DaoIAnnotation(choice =JOBAPPLICANT)
public class JobApplicantImpl implements DaoI {
    @PersistenceContext(unitName = "PUBLIC")

            private EntityManager entityManager;

    JobApplicant jobApplicant=null;
    public JobApplicantImpl() {
        jobApplicant=new JobApplicant();
    }

    @Override
    public boolean create(Object o) {
        jobApplicant= (JobApplicant) o;
        try {
            entityManager.persist(jobApplicant);
            return true;
        }catch (PersistenceException p){
            p.printStackTrace();
        }


        return false;
    }

    @Override
    public Object read(Object o) {
        jobApplicant= (JobApplicant) o;
        try{
            jobApplicant=entityManager.find(JobApplicant.class,jobApplicant.getJob_applicant_id());
            return jobApplicant;
        }catch (PersistenceException p){
            p.printStackTrace();
        }
        return jobApplicant;
    }

    @Override
    public Object update(Object o) {
        jobApplicant= (JobApplicant) o;
        try {
            jobApplicant=entityManager.find(JobApplicant.class,jobApplicant.getJob_applicant_id());
            entityManager.merge(jobApplicant);
            return jobApplicant;
        }catch (PersistenceException p){
            p.printStackTrace();

        }
        return jobApplicant;
    }

    @Override
    public boolean delete(Object o) {
        jobApplicant= (JobApplicant) o;
        try{
            entityManager.remove(jobApplicant);
            return true;
        }catch (PersistenceException p){
            p.printStackTrace();
            return false;
        }

    }

    @Override
    public List<Object> findAll(Object o) {
        return null;
    }

    @Override
    public Object findByID(Object o) {
        return null;
    }
}
