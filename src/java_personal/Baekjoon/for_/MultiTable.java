package java_personal.Baekjoon.for_;

import java.util.Scanner;

class MultiTable {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();

        for (int i = 1; i < 10; i++) 
            System.out.printf("%d * %d = %d\n", n, i, n*i);

        stdIn.close();
    }
}

