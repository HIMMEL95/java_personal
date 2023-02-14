package java_personal.LeetCode.Algorithms;

import java.util.Arrays;

public class ReverseInteger {

    public static int reverse(int x) {

        int total = 0;

        if (x > 0) {
            total = reverseNum(x);
        } else {
            x *= -1;
            total = reverseNum(x) * -1;
        }

        return total;
    }

    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x));
        x = -123;
        System.out.println(reverse(x));
        x = 120;
        System.out.println(reverse(x));
    }

    public static int reverseNum(int x) {
        String str = String.valueOf(x);
        String temp = "";
        String[] a = new String[str.length()];
        String result = "";

        for (int i=0; i<str.length(); i++) {
            a[i] = String.valueOf(str.charAt(i));
        }

        for (int i=0; i<str.length()/2; i++) {
            temp = a[i];
            a[i] = a[str.length()-i-1];
            a[str.length()-i-1] = temp;
        }

        for (String b : a) {
            result += b;
        }

        int total = Integer.parseInt(result);

        return total;
    }
}

