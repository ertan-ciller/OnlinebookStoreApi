package com.example.OnlineBookStoreApi.core.exceptionHandling;

public class AlreadyExistException extends RuntimeException{
    public AlreadyExistException(String message){
        super(message);
    }
}
