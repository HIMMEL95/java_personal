package java_personal.LeetCode.Algorithms;

class ShuffleString {

    public static String restoreString(String s, int[] indices) {

        int len = indices.length;
        char[] str = new char[len];
        String a = "";

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (indices[j] == i)
                    str[i] = s.charAt(j);
            }
            a += str[i];
        }
        return a;
    }

    public static void main(String[] args) {

        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};

        System.out.println(restoreString(s, indices));

    }
}

