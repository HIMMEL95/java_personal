package java_personal.Udemy.Recursion;

public class RecursionPower {
    
    public static void main(String[] args) {
        
        RecursionPower rp = new RecursionPower();
        int result = rp.power(2, 4);
        System.out.println(result);
    }

    public int power(int base, int exponent) {
        
        if (exponent == 0)
            return 1;
        if (base < 0 || exponent < 0)
            return -1;
        return base * power(base, exponent - 1);
    }
}
