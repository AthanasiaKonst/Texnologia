package com.mycompany.festival.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT) // Sets the HTTP status code to 409
public class ConflictException extends RuntimeException {

    public ConflictException(String message) {
        super(message);
    }
}