package org.example.task12;

public class Task12 {
    public String bookISBN;
    public String bookTitle;
    public String bookAuthor;
    public int bookPrice;
    public static int bookEdition;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Task12 task12 = (Task12) obj;

        return bookTitle.equals(task12.bookTitle) &&
                bookAuthor.equals(task12.bookAuthor) &&
                bookPrice == task12.bookPrice &&
                bookEdition == task12.bookEdition;
    }

    @Override
    public int hashCode() {
        int result = bookTitle.hashCode();
        result = 33 * result + bookAuthor.hashCode();
        result = 33 * result + bookPrice;
        result = 33 * result + bookEdition;
        return result;
    }

    @Override
    public String toString() {
        return "Task12{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookEdition=" + bookEdition +
                '}';
    }
}