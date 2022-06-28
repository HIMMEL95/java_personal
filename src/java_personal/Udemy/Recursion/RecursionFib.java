package java_personal.Udemy.Recursion;

class RecursionFib {

    public static void main(String[] args) {

        RecursionFib rf = new RecursionFib();
        int result = rf. fib(4);
        System.out.println(result);
    }

    public int fib(int n) {
        
        if (n < 0)
            return -1;
        if (n == 0 || n == 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}
