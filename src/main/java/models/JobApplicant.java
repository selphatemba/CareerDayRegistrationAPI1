package models;

import javax.persistence.*;

@Entity
public class JobApplicant {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Long job_applicant_id;
    private String first_name;
    private String last_name;
    private String email;
    private String phoneNumber;
    private EducationLevel education_level;
    private int years_of_experience;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public Long getJob_applicant_id() {
        return job_applicant_id;
    }

    public void setJob_applicant_id(Long job_applicant_id) {
        this.job_applicant_id = job_applicant_id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public EducationLevel getEducation_level() {
        return education_level;
    }

    public void setEducation_level(EducationLevel education_level) {
        this.education_level = education_level;
    }

    public int getYears_of_experience() {
        return years_of_experience;
    }

    public void setYears_of_experience(int years_of_experience) {
        this.years_of_experience = years_of_experience;
    }
}
