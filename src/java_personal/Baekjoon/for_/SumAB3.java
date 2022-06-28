package java_personal.Baekjoon.for_;
import java.util.Scanner;

class SumAB3 { 

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int T = stdIn.nextInt();

        for (int i = 0; i < T; i++) {
            int a = stdIn.nextInt();
            int b = stdIn.nextInt();

            System.out.println(a+b);
        }

        stdIn.close();

    }
}

