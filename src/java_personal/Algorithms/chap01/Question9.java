package java_personal.Algorithms.chap01;

public class Question9 {
	
	static int sumof(int a, int b) {
		
		int sum = 0;
		if (a < b) {
			for (int i = a; i <= b; i++)
				sum += i;
		}
		else {
			for (int i = b; i <= a; i++)
				sum += i;
		}
		
		return sum;
	}

	public static void main(String[] args) {

		int a = 3;
		int b = 5;
		System.out.println(sumof(a, b));
		
		a = 6;
		b = 4;
		System.out.println(sumof(a, b));
	}

}
