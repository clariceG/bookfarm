package com.apps.bookfarm.Author;

import com.apps.bookfarm.Author.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository <Author, Long> {
    Iterable<Author> findByPhoneNumber(int phoneNumber);

}
