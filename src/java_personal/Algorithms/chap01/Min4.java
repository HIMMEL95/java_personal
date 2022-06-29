package java_personal.Algorithms.chap01;

public class Min4 {
	
	static int min4(int a, int b, int c, int d) {
		
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;
		if (d < min) min = d;
		
		return min;
		
	}

	public static void main(String[] args) {

		System.out.println("min4(1,2,3,4) = "+ min4(1,2,3,4));
		System.out.println("min4(4,7,69,20) = "+ min4(4,7,69,20));
		System.out.println("min4(74,12,35,84) = "+ min4(74,12,35,84));
		System.out.println("min4(24,68,75,60) = "+ min4(24,68,75,60));
	}

}
