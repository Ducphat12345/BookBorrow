package com.itsol.model;

import java.util.Arrays;

public class Book_Management{

    private Reader reader;

    private Book[] book;

    private int totalBook;

    public Book_Management(){

    }

    public Book_Management(Reader reader, Book[] book, int totalBook) {
        this.reader = reader;
        this.book = book;
        this.totalBook = totalBook;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Book[] getBook() {
        return book;
    }

    public void setBook(Book[] book) {
        this.book = book;
    }

    public int getTotalBook() {
        return totalBook;
    }

    public void setTotalBook(int totalBook) {
        this.totalBook = totalBook;
    }

    @Override
    public String toString() {
        return "Book_Management{" +
                "reader=" + reader +
                ", book=" + Arrays.toString(book) +
                ", totalBook=" + totalBook +
                '}';
    }
}
