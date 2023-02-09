package java_personal.Algorithms.chap01;

public class Max4 {
	
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		if (d > max) max = d;
		
		return max;
	}

	public static void main(String[] args) {
		System.out.println("max4(4,8,3,5) = " + max4(4,8,3,5));
		System.out.println("max4(12,20,34,50) = " + max4(12,20,34,50));
		System.out.println("max4(7,0,3,3) = " + max4(7,0,3,3));
	}

}
