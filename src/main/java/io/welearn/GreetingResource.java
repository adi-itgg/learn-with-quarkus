package io.welearn;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class GreetingResource {

    @GET
    @Path("/hello-world")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }

    @GET
    @Path("/db-field")
    @Produces(MediaType.TEXT_PLAIN)
    @Transactional
    public String dbField() {
        MyEntity entity = new MyEntity();
        entity.field = "field-1";
        entity.persist();
        return "total data: " + MyEntity.count();
    }

}
