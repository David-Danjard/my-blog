package com.david.danjard.blog.resources;

import com.david.danjard.blog.model.users.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/users")
public class UserResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserResource.class);

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public User createUser(User user) {
        LOGGER.info("The password is {}", user.getPwd());
        return user;
    }

}
