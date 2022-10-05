package com.apps.bookfarm.Book;

import com.apps.bookfarm.Author.Author;

import javax.persistence.*;

@Entity
@Table(name="BOOK")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="BOOK_ID")
    private Long bookId;
    @Column(name="BOOK_TITLE")
    private String title;
    @ManyToOne
    @JoinColumn(name="AUTHOR_ID")
    private Author author;
    @Column(name="BOOK_PUBLISHER")
    private String publisher;
    @Column(name="BOOK_SUBJECT")
    private String subject;
    @Column(name="BOOK_ISBN")
    private int isbn;
    @Column(name="BOOK_LENGTH")
    private int length;

    public Book(String title, Author author, String publisher, String subject, int isbn, int length) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.subject = subject;
        this.isbn = isbn;
        this.length = length;
    }

    public Book() {

    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", publisher='" + publisher + '\'' +
                ", subject='" + subject + '\'' +
                ", isbn=" + isbn +
                ", length=" + length +
                '}';
    }
}
