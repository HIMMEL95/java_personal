package java_personal.Baekjoon.array;

import java.util.Scanner;

class OXQuiz {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int count = 1;
            String word = stdIn.next();
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == 'O') {
                    sum += count;
                    count++;
                }
                else 
                    count = 1;
            }
            System.out.println(sum);
        }

        stdIn.close();
    }
}
