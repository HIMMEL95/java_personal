package java_personal.Baekjoon.array;

import java.util.Scanner;

class CountNumber {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        
        int total = (stdIn.nextInt() * stdIn.nextInt() * stdIn.nextInt());

        String str = Integer.toString(total);

        stdIn.close();

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if ((str.charAt(j) - '0') == i) 
                    count++;
            }
            System.out.println(count);
        }
    }
}
