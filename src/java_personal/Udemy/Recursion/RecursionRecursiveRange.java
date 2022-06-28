package java_personal.Udemy.Recursion;

class RecursionRecursiveRange {

    public static void main(String[] args) {

        RecursionRecursiveRange rrr = new RecursionRecursiveRange();
        int result = rrr.recursiveRange(10);
        System.out.println(result);
    }

    public int recursiveRange(int num) {

        if (num <= 0)
            return 0;

        return num + recursiveRange(num - 1);
    }
}
