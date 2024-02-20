package com.example.OnlineBookStoreApi.core.exceptionHandling;

public class NotFoundException extends RuntimeException{

    public NotFoundException(String message){
        super(message);
    }
}
