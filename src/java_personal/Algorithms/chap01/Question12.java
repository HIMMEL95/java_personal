package java_personal.Algorithms.chap01;

public class Question12 {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			if (i == 1) {
				System.out.print("---+---------------------------");
			}
			else {
				for (int j = 0; j < 10; j++) {
					if (i == 0 && j == 0) {
						System.out.print("   |");
					}
					else if (i == 0 && j != 0) {
						System.out.printf("%3d", j);
					}
					else if (j == 0 && i != 0) {
						System.out.printf("%2d |", i-1);
					}
					else
						System.out.printf("%3d", (i-1)*j);
				}
				
			}
			System.out.println();
		}
	}

}
