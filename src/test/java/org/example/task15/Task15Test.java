package org.example.task15;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Task15Test {

    @Test
    public void testCompareTo() {
        Task15 book1 = new Task15();
        book1.setIsbn("123456789");
        book1.setTitle("Title");
        book1.setAuthor("Author");
        book1.setPrice(10);
        Task15.setEdition(1);

        Task15 book2 = new Task15();
        book2.setIsbn("987654321");
        book2.setTitle("Title");
        book2.setAuthor("Author");
        book2.setPrice(10);
        Task15.setEdition(2);

        int result1 = book1.compareTo(book2);
        int result2 = book2.compareTo(book1);

        Assertions.assertTrue(result1 < 0);  // Expecting book1 to be less than book2
        Assertions.assertTrue(result2 > 0);  // Expecting book2 to be greater than book1
        Assertions.assertEquals(0, book1.compareTo(book1));  // Expecting book1 to be equal to itself
    }

}