class Solution {
    public boolean isSameAfterReversals(int num) {
        String no = String.valueOf(num);

        int number = Integer.parseInt(reverse(no));
        String change2 = reverse(String.valueOf(number));

        if (no.equals(change2)) return true;

        return false;
    }
    
    public static String reverse(String no) {

        String temp = "";
        String[] list = new String[no.length()];

        for (int i=0; i<no.length(); i++) list[i] = (String.valueOf(no.charAt(i)));

        for (int i=0; i<no.length()/2; i++) {
            temp = list[i];
            list[i] = list[no.length()-i-1];
            list[no.length()-i-1] = temp;
        }

        String result ="";

        for (String n : list) result += n;
        return result;
    }
}