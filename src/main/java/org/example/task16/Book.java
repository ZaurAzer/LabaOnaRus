package org.example.task16;

public class Book {
    String title;
    String author;
    int price;
    int edition;

    Book(String title,
         String author,
         int price,
         int edition
    ) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.edition = edition;
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

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

}
