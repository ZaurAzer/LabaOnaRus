package org.example.task7;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Task7Test {

    @Test
    public void testSortArray() {
        double[] values = {5.0, 2.0, 8.0, 1.0, 3.0};
        Task7 task7 = new Task7(values);

        double[] expected = {1.0, 2.0, 3.0, 5.0, 8.0};

        double[] actual = task7.sortArray();
        Assertions.assertArrayEquals(expected, actual);
    }

}