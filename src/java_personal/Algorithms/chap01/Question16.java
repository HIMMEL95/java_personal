package java_personal.Algorithms.chap01;

import java.util.Scanner;

public class Question16 {

	static void spira(int n) {
		int k, j;
		for (int i = 0; i < n; i++) {
			for (k = n - i - 1; k > 0; k--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int m = 0; m < j-1; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		spira(n);
		sc.close();
	}

}
