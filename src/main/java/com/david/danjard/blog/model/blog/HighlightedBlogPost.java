package com.david.danjard.blog.model.blog;

public class HighlightedBlogPost extends BlogPost {

    private String mention;
    private int sequenceNumber;

    public String getMention() {
        return mention;
    }

    public void setMention(String mention) {
        this.mention = mention;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }
}
