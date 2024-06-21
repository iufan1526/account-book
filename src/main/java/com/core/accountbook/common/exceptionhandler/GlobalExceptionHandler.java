package com.core.accountbook.common.exceptionhandler;

import com.core.accountbook.user.exception.DuplicateIdException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DuplicateIdException.class)
    public ResponseEntity<String> handleDuplicateIdException(DuplicateIdException e) {
        return new ResponseEntity<>("이미 존재하는 아이디 입니다.", HttpStatus.BAD_REQUEST);
    }
}
