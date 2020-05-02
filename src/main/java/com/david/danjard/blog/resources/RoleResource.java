package com.david.danjard.blog.resources;

import com.david.danjard.blog.model.users.Role;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;

import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.validation.constraints.Size;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api/roles")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RoleResource {

    @APIResponse(responseCode = "200", description = "List of roles. Can be empty if no role found.")
    @GET
    @Transactional
    public List<Role> getRoles() {
        return Role.findAll().list();
    }

    @APIResponse(responseCode = "200", description = "Role added successfully")
    @APIResponse(responseCode = "400", description = "Invalid input data, generally size upper than 20 characters")
    @APIResponse(responseCode = "500", description = "An error occur on data insertion")
    @POST
    @Path("/{role-name}")
    @Transactional
    public Role addRole(@PathParam("role-name") @Valid @Size(max = 20) String role) {
        return Role.add(role);
    }

}
