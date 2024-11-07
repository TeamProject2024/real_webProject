package org.project.project.exceptionhandler;

import lombok.extern.slf4j.Slf4j;

import org.project.project.common.api.Api;
import org.project.project.common.error.ErrorCode;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j //Logger 객체를 직접 선언하지 않고 자동으로 로그를 사용
@RestControllerAdvice //예외를 이곳으로 끌어모음
@Order //여러 가지 예외에 대한 핸들러에 대해 순서를 지정
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Api<Object>> exception(
            Exception exception
    ){
        log.error("",exception);

        return ResponseEntity
                .status(500)
                .body(
                        Api.ERORR(ErrorCode.SERVER_ERROR)
                );
    }
}

