package com.david.danjard.blog.services;

import com.david.danjard.blog.model.blog.Category;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import java.util.Arrays;
import java.util.List;

@RequestScoped
public class CategoryServices {

    private static final Logger LOGGER = LoggerFactory.getLogger(CategoryServices.class);

    @PostConstruct
    public void init() {
        // Code executé juste après l'instanciation de l'objet
        LOGGER.info("Nouvelle instance de CategoryServices");
    }

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
