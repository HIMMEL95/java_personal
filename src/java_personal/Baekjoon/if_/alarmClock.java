package java_personal.Baekjoon.if_;

import java.util.Scanner;

class alarmClock {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int h = stdIn.nextInt();
        int m = stdIn.nextInt();

        if (m < 45) {
            if (h > 0) {
                h -= 1;
                m = 60 + m - 45;
                System.out.println(h + " " + m);
            }
            else {
                h = 23;
                m = 60 + m - 45;
                System.out.println(h + " " + m);
            }
        }
        else {
            m -= 45;
            System.out.println(h + " " + m);
        }

        stdIn.close();
    }
}
