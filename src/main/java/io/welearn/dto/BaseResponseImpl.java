package io.welearn.dto;

public record BaseResponseImpl(
    int code,
    String message,
    Object data
) implements BaseResponse {
}
