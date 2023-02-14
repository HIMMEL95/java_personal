package java_personal.Baekjoon.array;

import java.util.Scanner;

class OverAvg {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int c = stdIn.nextInt();

        for (int i = 0; i < c; i++) {
            int n = stdIn.nextInt();
            double[] score = new double[n];
            double sum = 0;

            for (int j = 0; j < n; j++) {
                score[j] = stdIn.nextInt();
                sum += score[j];
            }

            double avg = sum / n;

            double total = 0;
            for (int k = 0; k < n; k++) {
                if (score[k] > avg)
                    total++;
            }
            System.out.print(String.format("%.3f",(total / n) * 100));
            System.out.println("%");
        }

        stdIn.close();
    }
}
