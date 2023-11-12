package org.example.task13;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ProgrammerBookTest {
    @Test
    public void testEquals() {
        ProgrammerBook book1 = new ProgrammerBook();
        book1.setProgrammingLanguage("Java");
        book1.setProgrammingLevel(3);

        ProgrammerBook book2 = new ProgrammerBook();
        book2.setProgrammingLanguage("Java");
        book2.setProgrammingLevel(3);

        ProgrammerBook book3 = new ProgrammerBook();
        book3.setProgrammingLanguage("Python");
        book3.setProgrammingLevel(2);

        Assertions.assertEquals(book1, book2);  // Expecting book1 and book2 to be equal
        Assertions.assertNotEquals(book1, book3);  // Expecting book1 and book3 to be not equal
    }

    @Test
    public void testHashCode() {
        ProgrammerBook book1 = new ProgrammerBook();
        book1.setProgrammingLanguage("Java");
        book1.setProgrammingLevel(3);

        ProgrammerBook book2 = new ProgrammerBook();
        book2.setProgrammingLanguage("Java");
        book2.setProgrammingLevel(3);

        Assertions.assertEquals(book1.hashCode(), book2.hashCode());  // Expecting the hash codes to be equal
    }

    @Test
    public void testToString() {
        ProgrammerBook book = new ProgrammerBook();
        book.setProgrammingLanguage("Java");
        book.setProgrammingLevel(3);

        String expectedToString = "ProgrammerBook{programmingLanguage='Java', programmingLevel=3}";
        Assertions.assertEquals(expectedToString, book.toString());  // Expecting the toString representation to match
    }
}