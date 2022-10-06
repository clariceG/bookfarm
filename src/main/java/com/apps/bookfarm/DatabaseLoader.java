package com.apps.bookfarm;

import com.apps.bookfarm.Model.Author;
import com.apps.bookfarm.Repository.AuthorRepository;
import com.apps.bookfarm.Model.Book;
import com.apps.bookfarm.Repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseLoader {
    public static final Logger log = LoggerFactory.getLogger(DatabaseLoader.class);

    @Bean
    CommandLineRunner initDatabase(AuthorRepository authorRepository, BookRepository bookRepository){
        return args -> {

            Author authorOne = new Author("Sam Njeru",1234);
            Author authorTwo = new Author("Emily Jefferson",2468);

            //Save authorOne to the Author entity
            authorRepository.save(authorOne);
            authorRepository.save(authorTwo);
            //save new author
            authorRepository.save(new Author("Mike Wallace",23456 ));
            authorRepository.save(new Author("Kate Williams",46810 ));
            authorRepository.save(new Author("John Mutiso",3579 ));

            bookRepository.save(new Book("The Cow",authorTwo, "Mcmillan","Children",1234,100));
            bookRepository.save(new Book("The Mouse",authorOne, "Mitsubishi","Romance",3421,140));

            //Log the author entry
            authorRepository.findAll().forEach(author -> log.info("Preloaded Author:" + author));
            bookRepository.findAll().forEach(book -> log.info("Preloaded Book: " + book));
        };

    }
}
