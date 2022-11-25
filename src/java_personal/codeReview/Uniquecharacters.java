package java_personal.codeReview;

import java.util.HashMap;
import java.util.Map;

public class Uniquecharacters {
    public int firstUniqChar(String s) {
        Map<String, Integer> chars = new HashMap<String, Integer>();

        String[] str = {};
        int count = 0;

        for (int i=0; i<s.length(); i++) {
            if (!s.contains(s.charAt(i) + "0")) {
            	str[i] = s.charAt(i) + "0";
            }
            System.out.println(str[i]);
        }
        return 1;
    }
}
