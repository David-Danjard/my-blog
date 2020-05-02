package com.david.danjard.blog.resources;

import com.david.danjard.blog.model.users.Role;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api/roles")
public class RoleResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public List<Role> getRoles() {
        return Role.findAll().list();
    }

    @POST
    @Path("/{role-name}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Role addRole(@PathParam("role-name") String role) {
        return Role.add(role);
    }

}
