package java_personal.Udemy.Recursion;

class Power {

    public static void main(String[] args) {
	    Power power = new Power();
	    int result = power.power(2,-1);
	    System.out.println(result);
    }   

    public int power(int base, int exp) {
	    if (exp < 0)
		    return -1;
	    if (exp == 0)
		    return 1;
	    return base * power(base, exp - 1);
    }
}
