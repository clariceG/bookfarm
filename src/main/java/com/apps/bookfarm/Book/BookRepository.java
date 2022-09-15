package com.apps.bookfarm.Book;

import com.apps.bookfarm.Author.Author;
import com.apps.bookfarm.Book.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Book, Long> {

}
