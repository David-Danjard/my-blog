package com.david.danjard.blog.resources;

import com.david.danjard.blog.model.blog.Category;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("/api/categories")
public class CategoryResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Category> getAllCategories() {
        Category c1 = new Category();
        c1.setId(1L);
        c1.setName("Java");
        Category c2 = new Category();
        c2.setId(2L);
        c2.setName("Frontend");
        return Arrays.asList(c1, c2);
    }

}
