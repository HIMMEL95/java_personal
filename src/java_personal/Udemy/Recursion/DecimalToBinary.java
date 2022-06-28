package java_personal.Udemy.Recursion;

class DecimalToBinary {

    public static void main(String[] args) {
	    DecimalToBinary binary = new DecimalToBinary();
	    int result = binary.decimalToBinary(13);
	    System.out.println(result);
    }   

    public int decimalToBinary(int n) {
	    if (n== 0)
	    	return 0;
	    return n%2 + 10 * decimalToBinary(n/2);
    }
}
