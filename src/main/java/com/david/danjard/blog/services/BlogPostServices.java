package com.david.danjard.blog.services;

import com.david.danjard.blog.model.blog.BlogPost;
import com.david.danjard.blog.model.blog.Category;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@ApplicationScoped
public class BlogPostServices {

    private static final Logger LOGGER = LoggerFactory.getLogger(BlogPostServices.class);

    @PostConstruct
    public void init() {
        // Code executé juste après l'instanciation de l'objet
        LOGGER.info("Nouvelle instance de BlogPostServices");
    }

    public List<BlogPost> getPostsForCategory(long categoryId) {
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
