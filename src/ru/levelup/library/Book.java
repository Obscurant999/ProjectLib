package ru.levelup.library;

import java.util.Calendar;

/**
 * Created by kano on 02.07.17.
 */
public class Book implements LibInt {

    private long isbn;
    private String author;
    private String name;
    private Calendar releaseYear;

    public Book() {}

    @Override
    public void Book(long isbn, String author, String name, Calendar releaseYear) {
        this.isbn = isbn;
        this.author = author;
        this.name = name;
        this.releaseYear = releaseYear;
    }
}
