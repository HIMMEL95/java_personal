package java_personal.Baekjoon.if_;

import java.util.Scanner;

class OvenClock {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int h = stdIn.nextInt();
        int m = stdIn.nextInt();
        int c = stdIn.nextInt();

        h += c / 60;
        m += c % 60;

        if (m > 59) {
            h += 1;
            m -= 60;
        }
        if (h > 23)
            h -= 24;

        System.out.println(h + " " + m);

        stdIn.close();
    }
}

