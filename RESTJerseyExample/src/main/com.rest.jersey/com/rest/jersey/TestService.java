package com.rest.jersey;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/testservice")
public class TestService {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/one")
    public String getTestService() {
        return "Hello World! This is coming from webservice!!";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/bank")
    public void getAccount(@QueryParam("accountNo") String accNo, @QueryParam("password") int pswd){
        System.out.println("Customer Accno:" + accNo + " and Password is :" + pswd);
    }
}