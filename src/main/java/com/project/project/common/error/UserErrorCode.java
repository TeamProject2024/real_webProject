package org.project.project.common.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum UserErrorCode implements ErrorCodeIfs{
    USER_NOT_FOUND(400, 1404, "사용자를 찾을수 없음."),


    ;
    private final Integer httpStatusCode;

    private final Integer errorCode;

    private final String description;
}
