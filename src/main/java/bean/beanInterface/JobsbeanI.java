package bean.beanInterface;

import models.Job;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface JobsbeanI {
    @Bean
    boolean register(Job job);
    @Bean
    boolean edit(Job job);
    @Bean
    boolean findById(Job job);
    @Bean
    boolean remove(Job job);
    @Bean
    List<Job> findAllJobs();
}
