package org.example.task2;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task2 {

    public static boolean solve(int x, int y) {
        Set<Map.Entry<Integer, Integer>> validValues = createValidValues();
        return validValues.contains(Map.entry(x, y));
    }

    private static Set<Map.Entry<Integer, Integer>> createValidValues() {
        Set<Map.Entry<Integer, Integer>> values = new HashSet<>();

        for (int y = -1; y > -4; y--) {
            for (int i = -6; i < 7; i++) {
                values.add(Map.entry(i, y));
            }
        }

        for (int y = 1; y < 6; y++) {
            for (int i = -4; i < 5; i++) {
                values.add(Map.entry(i, y));
            }
        }

        return values;
    }

}


