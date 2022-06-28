package java_personal.Baekjoon.array;

import java.util.Scanner;

class Max {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int[] result = new int[9];
        int max = 0;

        for (int i = 0; i < 9; i++) {
            result[i] = stdIn.nextInt();
            if (max < result[i])
                max = result[i];
        }

        for (int j = 0; j < 9; j++) {
            if (max == result[j])
                System.out.printf("%d\n%d", result[j], j+1);
        }

        stdIn.close();
    }
}

