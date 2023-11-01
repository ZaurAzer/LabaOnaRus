package org.example.task9;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Task9Test {

    @Test
    public void testGetBallsQuantity() {
        Task9 task9 = new Task9();

        int expectedQuantity = 0;

        int actualQuantity = task9.getBallsQuantity();
        Assertions.assertEquals(expectedQuantity, actualQuantity);
    }

}


