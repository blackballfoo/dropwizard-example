package uk.co.zerogravit.server.dropwizard.respource;

import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/")
public class HelloWorldResource {

    @GET
    @Timed
    @Produces(MediaType.APPLICATION_JSON)
    @Path("helloworld")
    public String persistedCounters() {
        try {
            return "HelloWorld";
        } catch (Exception e) {
            throw new WebApplicationException(Response.Status.SERVICE_UNAVAILABLE);
        }
    }
}
