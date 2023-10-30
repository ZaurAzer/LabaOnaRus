package org.example.task4;

import java.util.ArrayList;

public class Task4 {

    public static ArrayList<Integer> solve(ArrayList<Integer> arr) {
        ArrayList<Integer> simpleInt = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if (isPrime(arr.get(i))) {
                simpleInt.add(i);
            }
        }

        return simpleInt;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}
