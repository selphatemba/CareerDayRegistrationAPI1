package bean.beanInterface;

import models.JobApplicant;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.ejb.Local;
import java.util.List;

@SpringBootApplication
public interface JobApplicantbeanI {
    @Bean
    boolean register(JobApplicant ja);
    @Bean
    boolean edit(JobApplicant ja);
    @Bean
    boolean findById(JobApplicant ja);
    @Bean
    boolean remove(JobApplicant ja);
    @Bean
    List<JobApplicant> findAllJobApplicants();

}
