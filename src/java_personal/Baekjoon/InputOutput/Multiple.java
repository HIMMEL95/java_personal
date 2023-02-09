package java_personal.Baekjoon.InputOutput;

import java.util.Scanner;

class Multiple {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();

        int first = b / 100;
        int second = (b % 100) / 10;
        int third = b % 10;

        System.out.println(a * third);
        System.out.println(a * second);
        System.out.println(a * first);
        System.out.println((a * third) + (a * second) * 10 + (a * first) * 100);

        stdIn.close();

    }
}
