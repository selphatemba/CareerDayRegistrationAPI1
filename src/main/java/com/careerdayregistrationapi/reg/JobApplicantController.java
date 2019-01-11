package com.careerdayregistrationapi.reg;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;
import java.io.InputStream;

public class JobApplicantController implements JobApplicantAPI {
    @Override
    public StreamingOutput getJobApplicant(HttpHeaders headers, long job_applicant_id) {
        return null;
    }

    @Override
    public Response saveOrUpdateJobApplicant(HttpHeaders headers, InputStream incomingData) {
        return null;
    }

    @Override
    public Response deleteJobApplicant(HttpHeaders headers, long job_applicant_id) {
        return null;
    }

    @Override
    public StreamingOutput selectJobInterview(HttpHeaders headers) {
        return null;
    }

    @Override
    public StreamingOutput deselectJobInterview(HttpHeaders headers, long job_applicant_id) {
        return null;
    }

    @Override
    public StreamingOutput jobsEnrolledFor(HttpHeaders headers, long job_applicant_id) {
        return null;
    }
}
