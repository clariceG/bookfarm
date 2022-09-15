package com.apps.bookfarm.Book;

public class BookNotFoundException extends RuntimeException {
    BookNotFoundException (Long id){
        super("Could not find book with id: " + id);
    }
}
