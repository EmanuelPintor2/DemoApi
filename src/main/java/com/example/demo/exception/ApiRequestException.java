package com.example.demo.exception;
import com.example.demo.model.Status;
public class ApiRequestException extends RuntimeException{
    public ApiRequestException(Status ignoredERROR, String message){
        super(message);
    }
}
