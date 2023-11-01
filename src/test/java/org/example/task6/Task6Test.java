package org.example.task6;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Task6Test {

    @Test
    public void testGenerateMatrix() {
        double[] elements = {1.0, 2.0, 3.0};
        Task6 task6 = new Task6(elements);

        double[][] expected = {
                {1.0, 2.0, 3.0},
                {2.0, 3.0, 1.0},
                {3.0, 1.0, 2.0}
        };

        double[][] actual = task6.generateMatrix();
        Assertions.assertArrayEquals(expected, actual);
    }

}