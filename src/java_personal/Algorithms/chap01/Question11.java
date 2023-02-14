package java_personal.Algorithms.chap01;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int n = sc.nextInt();
			if (n > 0) {
				String num = Integer.toString(n);
				System.out.println("그 수는 " + num.length() + "자리입니다.");
			}
			else {
				System.out.println("양수만 입력하세요.");
				break;
			}

		}
		
		sc.close();
	}

}
