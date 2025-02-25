package com.silassefas.controller.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);


    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handlerBusinesException(IllegalArgumentException businesException) {
        return new ResponseEntity<>(businesException.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handlerNotFoundException(NoSuchElementException notFoundException) {
        return new ResponseEntity<>("Resource ID not Found", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> handlerUnespectedException(Throwable unespectedException) {
        var message = "Unespected Server Erros, see the log for more details";
        logger.error("Unespected Server Erros", unespectedException);
        return new ResponseEntity<>("Unespected Server Erros", HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
