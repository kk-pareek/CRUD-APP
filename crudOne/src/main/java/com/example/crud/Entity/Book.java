package com.example.crud.Entity;

import javax.persistence.*;

@Entity
@Table(name = "bookTable")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long bookId;
    private String bookName;
    private String bookAuthor;

    public Book() {
    }

    public Book(long bookId, String bookName, String bookAuthor) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public long getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                '}';
    }
}
