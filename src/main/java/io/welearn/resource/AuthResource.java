package io.welearn.resource;

import io.welearn.dto.LoginRequest;
import io.welearn.dto.LoginResponse;
import io.welearn.model.UserEntity;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/auth")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AuthResource {

    @POST
    @Path("/login")
    public LoginResponse login(LoginRequest request) {
        UserEntity userEntity = UserEntity.find("email", request.email()).firstResult();
        if (userEntity == null) {
            throw new BadRequestException("user not found");
        }
        return new LoginResponse("eyaowijdoiwa");
    }


}
