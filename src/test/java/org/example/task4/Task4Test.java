package org.example.task4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Task4Test {

    @Test
    public void task4Test() {
        ArrayList<Integer> initArr = new ArrayList<>(Arrays.asList(1, 2, 4, 6));
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 13));
        ArrayList<Integer> res = Task4.solve(arr);
        assertEquals(res, initArr);
    }

}