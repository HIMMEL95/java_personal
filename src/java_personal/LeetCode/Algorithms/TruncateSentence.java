package java_personal.LeetCode.Algorithms;

public class TruncateSentence {

    public static String truncateSentence(String s, int k) {

        String[] str = s.split(" ");
        String result = "";

        for (int i=0; i<k; i++) {
            if (i<k-1) {
                result += str[i];
                result += " ";
            } else {
                result += str[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncateSentence(s, k));
    }
}
