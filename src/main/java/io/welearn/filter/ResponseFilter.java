package io.welearn.filter;

import io.welearn.dto.BaseResponse;
import io.welearn.dto.BaseResponseImpl;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.container.ContainerResponseFilter;
import jakarta.ws.rs.ext.Provider;

@Provider
public class ResponseFilter implements ContainerResponseFilter {

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) {
        Object value = responseContext.getEntity();
        if (!(value instanceof BaseResponse)) {
            responseContext.setEntity(new BaseResponseImpl(200, "success", value));
        }
    }

}
