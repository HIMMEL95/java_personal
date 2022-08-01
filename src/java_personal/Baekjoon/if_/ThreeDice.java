package java_personal.Baekjoon.if_;

import java.util.Scanner;

class ThreeDice {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();

        if (a == b && b == c && a == c)
            System.out.println(10000 + a*1000);
        else if (a == b || a == c)
            System.out.println(1000 + a*100);
        else if (b == c)
            System.out.println(1000 + b*100);
        else {
            if (a > b && a > c)
                System.out.println(a*100);
            else if (b > a && b > c)
                System.out.println(b*100);
            else
                System.out.println(c*100);
        }

        stdIn.close();
    }
}

