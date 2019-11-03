package com.itea.homeworks.exception;

public class HelloThisIsException extends RuntimeException {
    public HelloThisIsException(){
        super();
    }

    public HelloThisIsException(String message) {
        super(message);
    }
}
