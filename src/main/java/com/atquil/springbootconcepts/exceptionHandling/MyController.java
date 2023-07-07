package com.atquil.springbootconcepts.exceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController  {

    @GetMapping("/arthematic")
    public ResponseEntity<?> createArthematicException(){
        int x = 2/0;
        return new ResponseEntity<>("Some message", HttpStatus.ACCEPTED);
    }
}
