package org.example.task8;

public class Task8 {
    private double[] listA;
    private double[] listB;

    Task8(double[] listA, double[] listB) {
        this.listA = listA;
        this.listB = listB;
    }

    public double[] calculate() {
        double[] result = new double[listB.length];

        for (int i = 0; i < listB.length; i++) {
            result[i] = performCustomBinarySearch(listA, 0, listB.length - 1, listB[i]);
        }

        return result;
    }

    private double performCustomBinarySearch(double[] array, int left, int right, double target) {
        int mid = -1;

        if (target <= array[left])
            return left;
        if (target >= array[right])
            return right;

        while (left <= right) {
            mid = (left + right) / 2;

            if (target >= array[mid] && target < array[mid + 1])
                return mid + 1;

            if (target < array[mid])
                right = mid - 1;

            if (target > array[mid])
                left = mid + 1;
        }

        return mid;
    }
}