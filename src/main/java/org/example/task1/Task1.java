package org.example.task1;

public class Task1 {

    static public double solve(int x, int y) {
        double denominator = 1 + Math.pow(Math.sin(x + y), 2);
        double numerator = 2 + Math.abs(x - (2 * x / (1 + x^2 * y^2)));

        return numerator / denominator;
    }

}
