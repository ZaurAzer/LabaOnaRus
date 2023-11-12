package org.example.task14;

public class Task14 {
    private String title;
    private String author;
    private int price;
    private static int edition;

    @Override
    public Task14 clone() {
        try {
            Task14 clonedBook = (Task14) super.clone();
            clonedBook.title = new String(this.title);
            clonedBook.author = new String(this.author);
            return clonedBook;
        } catch (CloneNotSupportedException e) {
            return null;
        }
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
        Task14.edition = edition;
    }
}
