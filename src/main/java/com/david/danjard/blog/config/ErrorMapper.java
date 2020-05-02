package com.david.danjard.blog.config;

import com.david.danjard.blog.exceptions.BlogApplicationException;
import com.david.danjard.blog.model.technical.ErrorMsg;
import org.apache.commons.lang3.exception.ExceptionUtils;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ErrorMapper implements ExceptionMapper<Throwable> {

    @Override
    public Response toResponse(Throwable exception) {
        int code = 500;
        if (exception instanceof BlogApplicationException) {
            code = ((BlogApplicationException)exception).getStatusCode();
        }
        return Response.status(code)
                .entity(new ErrorMsg(code, ExceptionUtils.getRootCauseMessage(exception)))
                .build();
    }
}
