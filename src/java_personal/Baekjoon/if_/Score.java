package java_personal.Baekjoon.if_;
import java.util.Scanner;

class Score {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int score = stdIn.nextInt();

        if (score >= 90 && score <= 100) System.out.println("A");
        else if (score >= 80 && score <= 89) System.out.println("B");
        else if (score >= 70 && score <= 79) System.out.println("C");
        else if (score >= 60 && score <= 69) System.out.println("D");
        else System.out.println("F");

        stdIn.close();

    }
}

