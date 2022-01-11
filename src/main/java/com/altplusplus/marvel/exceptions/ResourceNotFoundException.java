package com.altplusplus.marvel.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException() {
        super("Resource Not Found");
    }
}
