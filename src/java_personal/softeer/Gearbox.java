package java_personal.softeer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gearbox {
	
	public static int[] asc = {1, 2, 3, 4, 5, 6, 7, 8};
	public static int[] dsc = {8, 7, 6, 5, 4, 3, 2, 1};
	
	public static boolean compare(int[] arr1, int[] arr2) {
		for (int i=0; i<8; i++) {
			if (arr1[i] != arr2[i]) return false;
		}
		return true;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        int[] arr = new int[8];
        
        for (int i=0; i<arr.length;i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        if (compare(asc, arr)) System.out.println("ascending");
        else if (compare(dsc, arr)) System.out.println("descending");
        else System.out.println("mixed");
        
	}

}
