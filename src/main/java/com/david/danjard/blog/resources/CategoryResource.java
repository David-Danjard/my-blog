package com.david.danjard.blog.resources;

import com.david.danjard.blog.model.blog.Category;
import com.david.danjard.blog.services.CategoryServices;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("/api/categories")
public class CategoryResource {

    private final CategoryServices categoryServices;

    @Inject
    public CategoryResource(CategoryServices categoryServices) {
        this.categoryServices = categoryServices;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Category> getAllCategories() {
        return categoryServices.getAllCategories();
    }

}
