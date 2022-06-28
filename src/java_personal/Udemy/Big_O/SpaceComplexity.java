package java_personal.Udemy.Big_O;

class SpcaeComplexity {

    static int pairSumSequence(int n) {
        int sum = 0;

        for (int i = 0; i <= n; i++)
            sum += pairSum(i, i+1);

        return sum;
    }

    static int pairSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int result = pairSumSequence(2);
        System.out.println(result);
    }
}

