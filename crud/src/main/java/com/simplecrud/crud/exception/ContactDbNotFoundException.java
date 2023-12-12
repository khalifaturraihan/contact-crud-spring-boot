package com.simplecrud.crud.exception;

public class ContactDbNotFoundException extends RuntimeException {

    public ContactDbNotFoundException(String message) {
        super(message);
    }

    public ContactDbNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
