package java_personal.Algorithms.chap01;

import java.util.Scanner;

public class Question17 {
	
	static void npira(int n) {
		int k, j, m;
		for (int i = 0; i < n; i++) {
			for (k = n - i - 1; k > 0; k--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print(i+1);
			}
			for (m = 0; m < i; m++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		npira(n);
		sc.close();
	}

}
