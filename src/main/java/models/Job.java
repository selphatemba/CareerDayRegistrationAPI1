package models;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
@Entity
public class Job {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Long job_id;
    private String job_name;
    @Lob
    private String job_description;
    private JobType job_type;
    private int years_of_experience;
    private EducationLevel education_level;
    private boolean job_status;
    @UniqueElements
    private Date interview_date;
    @UniqueElements
    private Time interview_start_time;
    private Time interview_end_time;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getJob_id() {
        return job_id;
    }

    public void setJob_id(Long job_id) {
        this.job_id = job_id;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public String getJob_description() {
        return job_description;
    }

    public void setJob_description(String job_description) {
        this.job_description = job_description;
    }

    public JobType getJob_type() {
        return job_type;
    }

    public void setJob_type(JobType job_type) {
        this.job_type = job_type;
    }

    public int getYears_of_experience() {
        return years_of_experience;
    }

    public void setYears_of_experience(int years_of_experience) {
        this.years_of_experience = years_of_experience;
    }

    public EducationLevel getEducation_level() {
        return education_level;
    }

    public void setEducation_level(EducationLevel education_level) {
        this.education_level = education_level;
    }

    public boolean isJob_status() {
        return job_status;
    }

    public void setJob_status(boolean job_status) {
        this.job_status = job_status;
    }

    public Date getInterview_date() {
        return interview_date;
    }

    public void setInterview_date(Date interview_date) {
        this.interview_date = interview_date;
    }

    public Time getInterview_start_time() {
        return interview_start_time;
    }

    public void setInterview_start_time(Time interview_start_time) {
        this.interview_start_time = interview_start_time;
    }

    public Time getInterview_end_time() {
        return interview_end_time;
    }

    public void setInterview_end_time(Time interview_end_time) {
        this.interview_end_time = interview_end_time;
    }
}
