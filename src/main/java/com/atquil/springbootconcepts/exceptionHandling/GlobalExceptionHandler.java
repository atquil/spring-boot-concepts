package com.atquil.springbootconcepts.exceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<?> handleArithmeticExceptionException(){
        return new ResponseEntity<>("ArithmeticException handled",HttpStatus.BAD_REQUEST);
    }

}
