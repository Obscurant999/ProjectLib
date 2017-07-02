package ru.levelup.library;

/**
 * Created by kano on 02.07.17.
 */
import java.util.Calendar;

public class Books {

    private long isbn;
    private String author;
    private String name;
    private Calendar releaseYear;

    public Books() {}

    public Books(long isbn, String author, String name, Calendar releaseYear) {
        this.isbn = isbn;
        this.author = author;
        this.name = name;
        this.releaseYear = releaseYear;
    }

}