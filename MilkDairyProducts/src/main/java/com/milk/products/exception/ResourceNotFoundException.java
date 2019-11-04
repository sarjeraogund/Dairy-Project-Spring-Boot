package com.milk.products.exception;

public class ResourceNotFoundException extends Exception { 
    public ResourceNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}