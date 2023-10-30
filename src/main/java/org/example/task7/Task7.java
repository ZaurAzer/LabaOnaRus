package org.example.task7;

public class Task7 {
    private double[] values;

    public Task7(double[] values) {
        this.values = values;
    }

    public double[] sortArray() {
        int length = values.length;
        int gap = length / 2;

        while (gap > 0) {
            for (int i = gap; i < length; i++) {
                double temp = values[i];
                int j = i;

                while (j >= gap && values[j - gap] > temp) {
                    values[j] = values[j - gap];
                    j -= gap;
                }

                values[j] = temp;
            }

            gap /= 2;
        }

        return values;
    }
}


