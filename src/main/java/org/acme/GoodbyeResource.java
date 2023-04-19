package org.acme;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/goodbye")
public class GoodbyeResource {

    @Inject
    GoodbyeService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String goodbye(String name){
        return "Goodbye";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{name}")
    public String sayGoodbye(String name){
        return service.sayGoodbye(name);
    }
}