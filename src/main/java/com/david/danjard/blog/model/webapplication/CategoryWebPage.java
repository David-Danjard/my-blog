package com.david.danjard.blog.model.webapplication;

import com.david.danjard.blog.model.blog.Category;

public class CategoryWebPage extends WebPage {

    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
