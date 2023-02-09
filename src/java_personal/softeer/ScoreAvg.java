package java_personal.softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ScoreAvg {
	
	public static int N, K;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(bf.readLine());
        int[] arr = new int[N+1];
        for(int i = 1; i <= N; i++) {
            int value = Integer.parseInt(st.nextToken());
            arr[i] = arr[i-1] + value;
        }
 
        for(int i = 0; i < K; i++) {
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            double value = (arr[b] - arr[a-1])/(double)(b-a+1);
            System.out.println(String.format("%.2f", value));
        }
    }
}
