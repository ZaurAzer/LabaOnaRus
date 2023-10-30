package org.example.task5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    private int[] arr;

    Task5(int[] arr) {
        this.arr = arr;
    }

    public int calculate() {
        ArrayList<Integer> result = new ArrayList<>();

        int length = arr.length;
        int[] sequence = new int[length];
        Arrays.fill(sequence, 1);

        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    sequence[i] = Math.max(sequence[i], sequence[j] + 1);
                }
            }
        }

        int maxLength = Arrays.stream(sequence).max().orElse(0);
        return length - maxLength;
    }

}
