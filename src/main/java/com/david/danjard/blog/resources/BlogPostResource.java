package com.david.danjard.blog.resources;

import com.david.danjard.blog.model.blog.BlogPost;
import com.david.danjard.blog.model.blog.Category;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Path("/api/blog-post")
public class BlogPostResource {

    @GET
    @Path("/{categoryId}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<BlogPost> getBlogPostsInCategory(@PathParam(value = "categoryId") long categoryId){
        BlogPost blogPost = new BlogPost();
        blogPost.setId(1L);
        blogPost.setTitle("Un titre pour mon blog");
        blogPost.setContent("Un contenu pour mon blog");
        blogPost.setCreateDate(LocalDateTime.now());
        blogPost.setUpdateDate(LocalDateTime.now());

        Category category = new Category();
        category.setId(categoryId);
        category.setName("DEFAULT");
        blogPost.setCategories(Collections.singletonList(category));

        return Collections.singletonList(blogPost);
    }

}
