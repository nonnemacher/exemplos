package dev.thehouseof.quarkus;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

@Path("/hello")
public class hello {

    @GET
    @Produces(TEXT_PLAIN)
    public String hello() {
        return "Quarkus, very cool";
    }
}