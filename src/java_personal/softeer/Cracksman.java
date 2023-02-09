package java_personal.softeer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cracksman {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int W = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for (int i=0; i<N; i++) {
            int metal = Integer.parseInt(st.nextToken());
            int money = Integer.parseInt(st.nextToken());

            System.out.println(metal + " " +money);
        }
    }
}
