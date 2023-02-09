package java_personal.Baekjoon.InputOutput;

import java.util.Scanner;

class Four_Funda {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int A = stdIn.nextInt();
        int B = stdIn.nextInt();

        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);
        
        stdIn.close();
    }
}

