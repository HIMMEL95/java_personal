package java_personal.Algorithms.chap01;

import java.util.Scanner;

public class Question15 {
	
	static void triangleLB(int n) {
		for (int i = 0; i < n; i++){
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleLU(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		int k = 0;
		for (int i = 0; i < n; i++) {
			for (k = 0; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = n-i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	static void triangleRB(int n) {
		int k;
		for (int i = n; i > 0; i--)	{
			for (k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= n-k; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		triangleLB(n);
		System.out.println();
		triangleLU(n);
		System.out.println();
		triangleRU(n);
		System.out.println();
		triangleRB(n);
		
		sc.close();
	}

}
