package dao.daoimplementation;

import dao.daointerface.DaoI;
import models.Job;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import java.util.List;

import static dao.daoimplementation.DaoIAnnotation.User.JOB;

@RequestScoped
@DaoIAnnotation(choice =JOB)
public class JobsImpl implements DaoI {

    private EntityManager entityManager;
    Job  job=null;


    public JobsImpl() {
        job=new Job();
    }

    @Override
    public boolean create(Object o) {
        job= (Job) o;
        try {
            entityManager.persist(job);
            return true;
        }catch (PersistenceException p){
            p.printStackTrace();
        }
        return false;
    }

    @Override
    public Object read(Object o) {
        job= (Job) o;
        try{
            job=entityManager.find(Job.class,job.getJob_id());
            return job;
        }catch (PersistenceException p){
            p.printStackTrace();
        }
        return job;
    }

    @Override
    public Object update(Object o) {
        job= (Job) o;
        try {
            job=entityManager.find(Job.class,job.getJob_id());
            entityManager.merge(job);
            return job;
        }catch (PersistenceException p){
            p.printStackTrace();

        }
        return job;
    }

    @Override
    public boolean delete(Object o) {
        job= (Job) o;
        try{
            entityManager.remove(job);
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
