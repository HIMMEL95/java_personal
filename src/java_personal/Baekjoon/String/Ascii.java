package java_personal.Baekjoon.String;

import java.util.Scanner;

class Ascii { 

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        char word = stdIn.next().charAt(0);

        System.out.printf("%d", (int)word);

        stdIn.close();

    }
}

