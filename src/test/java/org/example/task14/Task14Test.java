package org.example.task14;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Task14Test {
    @Test
    public void testClone() {
        Task14 book1 = new Task14();
        book1.setTitle("Title");
        book1.setAuthor("Author");
        book1.setPrice(10);
        Task14.setEdition(1);

        Task14 book2 = book1.clone();

        Assertions.assertNotNull(book2);
        Assertions.assertNotSame(book1, book2);  // Expecting book1 and book2 to be different objects
        Assertions.assertEquals(book1.getTitle(), book2.getTitle());  // Expecting the title to be the same
        Assertions.assertEquals(book1.getAuthor(), book2.getAuthor());  // Expecting the author to be the same
        Assertions.assertEquals(book1.getPrice(), book2.getPrice());  // Expecting the price to be the same
        Assertions.assertEquals(Task14.getEdition(), Task14.getEdition());  // Ex
    }
}