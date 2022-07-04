package java_personal.Baekjoon.array;

import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;

public class sortCoordinate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			map.put(a, b);
		}
		
		Set set = map.entrySet();
		System.out.println(set);
		sc.close();
	}

}
