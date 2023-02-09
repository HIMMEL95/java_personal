package java_personal.Baekjoon.array;

import java.util.Scanner;
import java.util.Arrays;

class MinMax {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int a = stdIn.nextInt();
            result[i] = a;
        }

        Arrays.sort(result);

        System.out.println(result[0] + " " + result[n-1]);

        stdIn.close();
    }
}
