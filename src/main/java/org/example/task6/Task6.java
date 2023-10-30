package org.example.task6;

public class Task6 {
    private double[] elements;

    Task6(double[] elements) {
        this.elements = elements;
    }

    public double[][] generateMatrix() {
        double[][] result = new double[elements.length][elements.length];
        int y = 0;

        for (int i = 0; i < elements.length; i++) {
            for (int j = i; j < elements.length; j++) {
                result[i][y] = elements[j];
                y++;
            }
            for (int k = 0; k < i; k++) {
                result[i][y] = elements[k];
                y++;
            }
        }

        return result;
    }
}
