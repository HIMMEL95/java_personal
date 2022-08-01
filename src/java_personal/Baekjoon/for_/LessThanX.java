package java_personal.Baekjoon.for_;

import java.util.Scanner;

class LessThanX {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int x = stdIn.nextInt();

        for (int i = 0; i < n; i++) {
            int a = stdIn.nextInt();
            if (a < x)
                System.out.print(a + " ");
        }

        stdIn.close();
    }
}
