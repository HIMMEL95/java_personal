package java_personal.Baekjoon.for_;
import java.util.Scanner;

class NSum {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++)
            sum += i;

        System.out.println(sum);
        stdIn.close();

    }
}

