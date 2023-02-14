package java_personal.Baekjoon.InputOutput;

import java.util.Scanner;

class DivAB {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        double a = stdIn.nextInt();
        double b = stdIn.nextInt();

        System.out.println(String.format("%.9f", a/b));
        
        stdIn.close();
    }
}

