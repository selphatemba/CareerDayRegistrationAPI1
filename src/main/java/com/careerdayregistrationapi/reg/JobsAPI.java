package com.careerdayregistrationapi.reg;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;
import java.io.InputStream;

@Path("/job")
public interface JobsAPI {

    @GET
    @Path("/{jobID}")
    @Produces("application/json")
    StreamingOutput getJob(@Context HttpHeaders headers, @PathParam("jobID")  long job_id);


    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/saveorupdatejob")
    Response saveOrUpdateJob(@Context HttpHeaders headers, InputStream incomingData);

    @DELETE
    @Path("/jobstoberemoved/{jobID}")
    @Consumes("application/json")
    Response deleteJob(@Context HttpHeaders headers, @PathParam("jobID")  long job_id);

    @GET
    @Path("/applicants/{jobID}")
    @Produces("application/json")
    StreamingOutput getJobApplicants(@Context HttpHeaders headers, @PathParam("jobID")  long job_id);


}
