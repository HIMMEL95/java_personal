package java_personal.Algorithms.chap01;

public class Question12 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 0) {
					System.out.print(i);
				}
				else if (j == 0 && i != 0) {
					System.out.print(i);
				}
				else
					System.out.printf("%3d", i*j);
			}
			System.out.println();
		}
	}

}
