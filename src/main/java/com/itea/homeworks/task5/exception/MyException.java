package com.itea.homeworks.task5.exception;

public class MyException extends RuntimeException {
    public MyException(){
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
