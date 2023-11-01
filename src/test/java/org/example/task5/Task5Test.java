package org.example.task5;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Task5Test {

    @Test
    public void testCalculate() {
        int[] arr = {3, 4, 2, 1, 6, 5};
        Task5 task5 = new Task5(arr);

        int expected = 3;

        int actual = task5.calculate();
        Assertions.assertEquals(expected, actual);
    }

}