package org.example.task8;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Task8Test {

    @Test
    public void testCalculate() {
        double[] listA = {1.0, 3.0, 5.0, 7.0, 9.0};
        double[] listB = {2.0, 4.0, 6.0, 8.0, 10.0};
        Task8 task8 = new Task8(listA, listB);

        double[] expected = {1.0, 2.0, 3.0, 4.0, 4.0};

        double[] actual = task8.calculate();
        Assertions.assertArrayEquals(expected, actual);
    }

}