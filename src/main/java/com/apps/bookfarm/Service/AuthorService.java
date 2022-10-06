package com.apps.bookfarm.Service;

import com.apps.bookfarm.Model.Author;

public interface AuthorService {
    public Iterable<Author> getAuthors();
    public void addNewAuthor(Author author);
    public void removeAuthor(Long id);
}