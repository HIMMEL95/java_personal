package java_personal.Baekjoon.array;

import java.util.Scanner;

class Avg {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        double max = 0;
        double[] score = new double[n];

        for (int i = 0; i < n; i++) {
            score[i] = stdIn.nextDouble();
            if (score[i] > max)
                max = score[i];
        }

        double sum = 0;
        for (int j = 0; j < n; j++)
            sum += (score[j] / max) * 100;
        System.out.printf("%.6f", sum / n);
        
        stdIn.close();
    }
}

