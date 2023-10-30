package org.example.task3;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task3Test {

    @Test
    public void task3Test() {
        double[][] res = Task3.solve(1 , 4, 2);
        assertEquals(res[1][1], -2.185039863261519);
    }

}