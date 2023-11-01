package org.example.task16.comporator;

import org.example.task16.Book;
import java.util.Comparator;

public class NameComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }

}
