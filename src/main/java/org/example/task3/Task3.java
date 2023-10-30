package org.example.task3;

public class Task3 {

    public static double[][] solve(int a, int b, double h) {
        int i = 0;
        int t = (int) Math.ceil((b-a+h)/h);
        double[][] res = new double[t][2];

        for (double x = 0; x <= b; x += h, i++) {
            res[i][0] = x;
            res[i][1] = Math.tan(x);
        }

        return res;
    }

}


