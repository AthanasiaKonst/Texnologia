package com.mycompany.festival.exception;

// Απλά  επεκτείνει την RuntimeException. Αυτό είναι όλο!
public class FestivalNotFoundException extends RuntimeException {
    public FestivalNotFoundException(String message) {
        super(message);
    }
}