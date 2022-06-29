package java_personal.Algorithms.chap01;

public class Min3 {
	
	static int min3(int a, int b, int c) {
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;
		
		return min;
	}

	public static void main(String[] args) {
		
		System.out.println("min3(1,2,3) = " + min3(1,2,3));
		System.out.println("min3(7,2,5) = " + min3(7,2,5));
		System.out.println("min3(11,52,49) = " + min3(11,52,49));
		System.out.println("min3(23,15,47) = " + min3(23,15,47));

	}

}
