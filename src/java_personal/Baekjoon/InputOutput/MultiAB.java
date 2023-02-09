package java_personal.Baekjoon.InputOutput;

import java.util.Scanner;

class MultiAB {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();

        System.out.println(a * b);
        
        stdIn.close();
    }
}

