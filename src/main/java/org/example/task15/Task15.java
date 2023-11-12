package org.example.task15;

import org.example.task12.Task12;

public class Task15 implements Comparable<Task15> {
    private String isbn;
    private String title;
    private String author;
    private int price;
    private static int edition;

    @Override
    public int compareTo(Task15 o) {
        return this.isbn.compareTo(o.isbn);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Task15.edition = edition;
    }
}


