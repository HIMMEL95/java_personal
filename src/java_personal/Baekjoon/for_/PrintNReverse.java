package java_personal.Baekjoon.for_;

import java.util.Scanner;

class PrintNReverse {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();

        for (int i = N; i > 0; i--)
            System.out.println(i);

        stdIn.close();

    }
}
