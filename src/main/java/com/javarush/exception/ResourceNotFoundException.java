package ru.javarush.exception;

import lombok.Data;

@Data
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message) {
        super(message);
    }

}
