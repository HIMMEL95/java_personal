package java_personal.Algorithms.chap01;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a의 값 :");
		int a = sc.nextInt();
		int b = 0;
		
		while (true) {
			
			System.out.print("b의 값 :");
			b = sc.nextInt();
			
			if (a >= b)
				System.out.println("a보다 큰 값을 입력하세요!");
			else
				break;
		}
		
		System.out.println("b-a는 " + (b-a) + " 입니다.");
		sc.close();
	}

}
