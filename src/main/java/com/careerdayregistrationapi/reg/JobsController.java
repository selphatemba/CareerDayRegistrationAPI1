package com.careerdayregistrationapi.reg;

import bean.beanInterface.JobsbeanI;
import models.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;
import java.io.InputStream;

@RestController
@RequestMapping("/jobs")
public class JobsController implements JobsAPI {
    @Autowired
    private JobsbeanI jobsbeanI;
    Job job=new Job();
    @Override
    public StreamingOutput getJob(HttpHeaders headers, long job_id) {
    jobsbeanI.findById(job);
    return null;
    }

    @Override
    public Response saveOrUpdateJob(HttpHeaders headers, InputStream incomingData) {
        return null;
    }

    @Override
    public Response deleteJob(HttpHeaders headers, long job_id) {
        return null;
    }

    @Override
    public StreamingOutput getJobApplicants(HttpHeaders headers, long job_id) {
        return null;
    }
}
