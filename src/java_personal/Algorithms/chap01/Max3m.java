package java_personal.Algorithms.chap01;

public class Max3m {

	static int max3(int a, int b, int c) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max =c;
		
		return max;
	}
	
	public static void main(String[] args) {
		
		System.out.println("max3(3,2,1) = " + max3(3,2,1));
		System.out.println("max3(3,5,4) = " + max3(3,5,4));
		System.out.println("max3(5,2,1) = " + max3(5,2,1));
		System.out.println("max3(7,9,0) = " + max3(7,9,0));
		System.out.println("max3(6,7,5) = " + max3(6,7,5));
		System.out.println("max3(1,6,4) = " + max3(1,6,4));
		
	}

}
