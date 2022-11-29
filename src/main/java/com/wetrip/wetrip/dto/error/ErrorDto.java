package com.wetrip.wetrip.dto.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorDto {
    private final int status;
    private final String code;
    private final String message;
}
