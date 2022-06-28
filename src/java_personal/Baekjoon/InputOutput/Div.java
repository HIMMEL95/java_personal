package java_personal.Baekjoon.InputOutput;

import java.util.Scanner;

class Div {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();

        System.out.println((a + b) % c);
        System.out.println(((a % c) + (b % c)) % c);
        System.out.println((a * b) % c);
        System.out.println(((a % c) * (b % c)) % c);

        stdIn.close();
    }
}

