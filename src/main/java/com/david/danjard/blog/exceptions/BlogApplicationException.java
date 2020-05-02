package com.david.danjard.blog.exceptions;

public class BlogApplicationException extends RuntimeException {

    private int statusCode;

    public BlogApplicationException(int statusCode) {
        this.statusCode = statusCode;
    }

    public BlogApplicationException(int statusCode, String message) {
        super(message);
        this.statusCode = statusCode;
    }

    public BlogApplicationException(int statusCode, String message, Throwable cause) {
        super(message, cause);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
