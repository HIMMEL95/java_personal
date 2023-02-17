package java_personal.softeer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MileageCompare {
    public static void main(String[] args) throws Exception {

        long startTime = System.currentTimeMillis();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if (A > B)
            System.out.println("A");
        else if (A < B)
            System.out.println("B");
        else
            System.out.println("same");

        br.close();
        long endTime = System.currentTimeMillis();
        System.out.println(String.format("코드 실행 시간 : %20dms", endTime - startTime));
    }
}
