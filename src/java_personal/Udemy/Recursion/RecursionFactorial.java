package java_personal.Udemy.Recursion;

class RecursionFactorial {

    public static void main(String[] args) {
        
        RecursionFactorial rf = new RecursionFactorial();
        int result = rf.factorial(4);
        System.out.println(result);

    }

    public int factorial(int num) {
        
        if (num == 0)
            return 1;
        return num * factorial(num - 1);
    }
}
