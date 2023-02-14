package java_personal.Baekjoon.for_;

import java.util.Scanner;

class Star2 {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            for (int j = 0; j < i+1; j++)
                System.out.print("*");
            System.out.println();
        }

        stdIn.close();
    }
}
