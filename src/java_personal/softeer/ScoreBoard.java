package java_personal.softeer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ScoreBoard {
	
	private static Map<Integer, int[]> map;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		
		map = new HashMap<>();
		map.put(0, new int[] {1,1,0,1,1,1,1});
		map.put(1, new int[] {0,1,0,1,0,0,0});
		map.put(2, new int[] {1,1,1,0,1,1,0});
		map.put(3, new int[] {1,1,1,1,1,0,0});
		map.put(4, new int[] {0,1,1,1,0,0,1});
		map.put(5, new int[] {1,0,1,0,1,1,0});
		map.put(6, new int[] {1,0,1,1,1,1,1});
		map.put(7, new int[] {1,1,0,1,0,0,0});
		map.put(8, new int[] {1,1,1,1,1,1,1});
		map.put(9, new int[] {1,1,1,1,1,0,1});
		
		
		
		for (int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int[] N = new int[a];
			int[] M = new int[b];
			
			for (int j=0; j<5-a; j++) {
				N[i] = map.get(1);
			}

		}
		
	}
	
}
