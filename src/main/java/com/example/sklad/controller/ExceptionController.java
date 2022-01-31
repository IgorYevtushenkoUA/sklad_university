package com.example.sklad.controller;

import com.example.sklad.exceptions.NotFoundByIdException;
import com.example.sklad.exceptions.NotUniqueNameException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(value = NotFoundByIdException.class)
    public ResponseEntity<Object> exception(NotFoundByIdException e) {
        return new ResponseEntity<>("Not found by ID", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = NotUniqueNameException.class)
    public ResponseEntity<Object> exception(NotUniqueNameException e) {
        return new ResponseEntity<>("Name is not unique", HttpStatus.CONFLICT);
    }
}
