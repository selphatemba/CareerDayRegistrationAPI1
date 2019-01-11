package com.careerdayregistrationapi.reg;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;
import java.io.InputStream;

@Path("/jobapplicant")
public interface JobApplicantAPI {

    @GET
    @Path("/applicant/{jobapplicantID}")
    @Produces("application/json")
    StreamingOutput getJobApplicant(@Context HttpHeaders headers, @PathParam("jobapplicantID")  long job_applicant_id);


    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("saveorupdatejobapplicant")
    Response saveOrUpdateJobApplicant(@Context HttpHeaders headers, InputStream incomingData);

    @DELETE
    @Path("/applicant/{jobapplicantID}")
    @Consumes("application/json")
    Response deleteJobApplicant(@Context HttpHeaders headers, @PathParam("jobapplicantID")  long job_applicant_id);

    @GET
    @Path("/selectJobInterview")
    @Produces("application/json")
    StreamingOutput selectJobInterview(@Context HttpHeaders headers);

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/deselectjobinterview/{jobapplicantID}")
    StreamingOutput deselectJobInterview(@Context HttpHeaders headers,@PathParam("jobapplicantID")  long job_applicant_id);

    @GET
    @Path("/jobsenrolledfor/{jobapplicantID}")
    @Produces("application/json")
    StreamingOutput jobsEnrolledFor(@Context HttpHeaders headers,@PathParam("jobapplicantID")  long job_applicant_id);


}
