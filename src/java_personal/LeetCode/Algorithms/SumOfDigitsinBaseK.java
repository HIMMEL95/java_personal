package java_personal.LeetCode.Algorithms;

public class SumOfDigitsinBaseK {

    public static int sumBase(int n, int k) {

        int result = 0;

        while (n/k != 0) {
            result += (n / k);
            System.out.println(result);
            n /= k;
            System.out.println("n : " +  n);
        }

        result += n;
        return result;
    }

    public static void main(String[] args) {

        int n = 42;
        int k = 2;
        System.out.println(sumBase(n, k));
    }
}
