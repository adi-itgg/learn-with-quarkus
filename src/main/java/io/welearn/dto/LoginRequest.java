package io.welearn.dto;

public record LoginRequest(
    String email,
    String password
) {
}
