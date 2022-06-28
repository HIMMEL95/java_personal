package java_personal.Baekjoon.for_;
import java.util.Scanner;

class SumAB8 {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int T = stdIn.nextInt();

        for (int i = 0; i < T; i++) {
            int a = stdIn.nextInt();
            int b = stdIn.nextInt();

            System.out.printf("Case #%d: %d + %d = %d\n", i+1, a, b, a+b);

        }

        stdIn.close();
    }
}
