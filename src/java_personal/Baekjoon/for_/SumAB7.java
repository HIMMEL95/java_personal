package java_personal.Baekjoon.for_;

import java.util.Scanner;

class SumAB7 {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int T = stdIn.nextInt();

        for (int i = 0; i < T; i++) {
            int a = stdIn.nextInt();
            int b = stdIn.nextInt();

            System.out.printf("Case #%d: %d\n", i+1, a+b);

        }

        stdIn.close();
    }
}
