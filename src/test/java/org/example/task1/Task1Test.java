package org.example.task1;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task1Test {

    @Test
    public void task1Test() {
        double rightRes = Task1.solve(5, 7);

        assertEquals(rightRes, 4.658708828828142);
    }

}