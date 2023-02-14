package java_personal.Baekjoon.for_;

import java.util.Scanner;

class PrintN {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();

        for (int i = 1; i <= N; i++)
            System.out.println(i);

        stdIn.close();
    }
}

