package com.david.danjard.blog.model.webapplication;

import com.david.danjard.blog.model.blog.HighlightedBlogPost;

import java.util.List;

public class StaticWebPage extends WebPage {

    private List<HighlightedBlogPost> highlightedBlogPosts;
    private String staticPageContent;
    private Template template;
    private String picture;

    public List<HighlightedBlogPost> getHighlightedBlogPosts() {
        return highlightedBlogPosts;
    }

    public void setHighlightedBlogPosts(List<HighlightedBlogPost> highlightedBlogPosts) {
        this.highlightedBlogPosts = highlightedBlogPosts;
    }

    public String getStaticPageContent() {
        return staticPageContent;
    }

    public void setStaticPageContent(String staticPageContent) {
        this.staticPageContent = staticPageContent;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
