package com.apps.bookfarm.Repository;

import com.apps.bookfarm.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long>{

    List<Book> findByIsbn(int isbn);
    Optional<Book> findByBookTitle(String title);
}