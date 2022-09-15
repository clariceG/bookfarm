package com.apps.bookfarm.Author;

public class AuthorNotFoundException extends RuntimeException{
    AuthorNotFoundException (Long id){
        super("Could not find author with id: " + id);
    }
}

