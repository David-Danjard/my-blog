package com.david.danjard.blog.resources;

import com.david.danjard.blog.model.blog.BlogPost;
import com.david.danjard.blog.services.BlogPostServices;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api/blog-post")
public class BlogPostResource {

    private final BlogPostServices blogPostServices;

    @Inject
    public BlogPostResource(BlogPostServices blogPostServices) {
        this.blogPostServices = blogPostServices;
    }

    @GET
    @Path("/{categoryId}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<BlogPost> getBlogPostsInCategory(@PathParam(value = "categoryId") long categoryId){
        return blogPostServices.getPostsForCategory(categoryId);
    }

}
