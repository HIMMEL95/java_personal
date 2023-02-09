class Solution {
    public String toLowerCase(String s) {
//         String result = s.toLowerCase();

//         return result;
        String result = "";

        String[] c = new String[s.length()];

        for (int i=0; i<s.length(); i++) {
            c[i] = String.valueOf(s.charAt(i));
        }

        for (String a : c) {
            if (Character.isUpperCase(a.charAt(0))) {
                String str = a.toLowerCase();
                result += str;
            } else {
                result += a;
            }
        }

        return result;
    }
}