package com.apps.bookfarm.Book;

import com.apps.bookfarm.Author.Author;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //lists all types of books
    @GetMapping("/books")
    List<Book> allBooks(){
        return bookRepository.findAll();
    }

    @GetMapping("/books/{id}")
    Book oneBook(@PathVariable Long id){
      return bookRepository.findById(id).orElseThrow(()->new BookNotFoundException(id));
    }

    //adds values of books that are new
    @PostMapping("/books")
    Book newBook (@RequestBody Book newBook){
        return bookRepository.save(newBook);
    }

    // deletes values of books
    @DeleteMapping("/books")
    void deleteBook(@PathVariable Long id){
        bookRepository.deleteById(id);
    }

    //updates values of books
    //for put/update first find out if the data you want to edit exists
    @PutMapping("/books/{id}")
    Book replaceBook(@RequestBody Book newBook, @PathVariable Long id){
        return bookRepository.findById(id).map(book -> {
            book.setAuthor(newBook.getAuthor());
            book.setIsbn(newBook.getIsbn());
            book.setLength(newBook.getLength());
            book.setPublisher(newBook.getPublisher());
            book.setSubject(newBook.getSubject());
            book.setTitle(newBook.getTitle());
            return bookRepository.save(newBook);
        }).orElseGet(()->{newBook.setBookId(id);
            return bookRepository.save(newBook);
        });
}}
