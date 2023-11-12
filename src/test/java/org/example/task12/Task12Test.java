package org.example.task12;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Task12Test {

    @Test
    public void testEquals() {
        Task12 book1 = new Task12();
        book1.bookTitle = "Title";
        book1.bookAuthor = "Author";
        book1.bookPrice = 10;
        book1.bookEdition = 1;

        Task12 book2 = new Task12();
        book2.bookTitle = "Title";
        book2.bookAuthor = "Author";
        book2.bookPrice = 10;
        book2.bookEdition = 1;

        Task12 book3 = new Task12();
        book3.bookTitle = "Different Title";
        book3.bookAuthor = "Author";
        book3.bookPrice = 10;
        book3.bookEdition = 1;

        Assertions.assertEquals(book1, book2);
        Assertions.assertNotEquals(book1, book3);
    }

    @Test
    public void testHashCode() {
        Task12 book1 = new Task12();
        book1.bookTitle = "Title";
        book1.bookAuthor = "Author";
        book1.bookPrice = 10;
        book1.bookEdition = 1;

        Task12 book2 = new Task12();
        book2.bookTitle = "Title";
        book2.bookAuthor = "Author";
        book2.bookPrice = 10;
        book2.bookEdition = 1;

        Assertions.assertEquals(book1.hashCode(), book2.hashCode());
    }

    @Test
    public void testToString() {
        Task12 book = new Task12();
        book.bookTitle = "Title";
        book.bookAuthor = "Author";
        book.bookPrice = 10;
        book.bookEdition = 1;

        String expectedToString = "Task12{bookTitle='Title', bookAuthor='Author', bookPrice=10, bookEdition=1}";
        Assertions.assertEquals(expectedToString, book.toString());
    }

}


