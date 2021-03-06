package java_personal.Udemy.Recursion;

class GCD {

    public static void main(String[] args) {
	    GCD gcd = new GCD();
	    int result = gcd.gcd(4,8);
	    System.out.println(result);
    }

    public int gcd(int a, int b) {
	    if (a < 0 || b < 0)
		    return -1;
    	if (b == 0)
		    return a;
	    return gcd(b, a%b);
    }
}
