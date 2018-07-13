package io.priyo.ApplicationService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/myresource")
public class MyResource {

   
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage() {
        return "Hello From "+MyResource.class;
    }
}
