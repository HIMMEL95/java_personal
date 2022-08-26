package java_personal.HackerRank.Easy;

import java.io.*;

public class Staircase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result1.staircase(n);

        bufferedReader.close();
    }
}

class Result1 {

    public static void staircase(int n) {
    // Write your code here

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

}
