package com.wetrip.wetrip.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    // 400 Bad Request
    INVALID_AGE(400, "U0002", "만 13게 이상만 가입 가능합니다."),
    // 401 Unauthorized
    // 403 Forbidden
    // 404 Not Found
    USER_NOT_FOUND(404,"U0003","가입되지 않은 회원입니다."),
    // 405 Method Not Allowed
    // 409 Conflict
    ALREADY_JOINED_USER(409, "U0001", "이미 가입된 회원입니다."),
    INTERNAL_SERVER_ERROR(500, "E500","서버 에러입니다.");

    private final int status;
    private final String code;
    private final String message;
}
