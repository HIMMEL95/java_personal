package java_personal.LeetCode.Algorithms;

class SubtractTheProductAndSumOfDigitsOfAnInteger {

    public static int subtractProductAndSum(int n) {

        int product = 1;
        int sum = 0;

        while (n > 0) {
            product *= (n % 10);
            sum += (n % 10);
            n /= 10;
        }

        return (product - sum);
    }

    public static void main(String[] args) {

        int n = 234;
        System.out.println(subtractProductAndSum(n));

        int n1 = 4421;
        System.out.println(subtractProductAndSum(n1));

    }
}
