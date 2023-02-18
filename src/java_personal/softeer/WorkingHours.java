package java_personal.softeer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class WorkingHours {

    public static int hour(String s) {
        String result = "";

        for (int i = 1; i < 3; i++) {
            result += s.charAt(i);
        }

        int time = Integer.parseInt(result);

        return time;
    }

    public static int minute(String s) {
        String result = "";

        for (int i = 5; i <= 6; i++) {
            result += s.charAt(i);
        }

        int time = Integer.parseInt(result);

        return time;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int hour = 0;
        int min = 0;
        for (int i = 0; i < 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String startTime = Arrays.toString(st.nextToken().split(":", 2));
            int start_hour = hour(startTime);
            int start_min = minute(startTime);
            String endTime = Arrays.toString(st.nextToken().split(":", 2));
            int end_hour = hour(endTime);
            int end_min = minute(startTime);

            System.out.println(start_min);
            System.out.println(end_min);

            if (end_min - start_min < 0) {
                start_hour -= 1;
                min += 60 - (end_min - start_min);
                System.out.println("1");
            } else {
                min += (end_min - start_min);
                System.out.println("3");
            }

            hour += (end_hour - start_hour);

            System.out.println(hour + "," + min);
        }

        int result = (hour * 60) + min;
        System.out.println(result);

        br.close();
    }
}
