package java_personal.Baekjoon.String;

import java.util.Scanner;

class NumberSum {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        String a = stdIn.next();
        stdIn.close();

        int sum = 0;

        for (int i = 0; i < n; i++)
            sum += a.charAt(i) - '0';

        System.out.println(sum);

    }
}

