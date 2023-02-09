package java_personal.Udemy.Recursion;

class RecursionIsPalindrome {

    public static void main(String[] args) {

        RecursionIsPalindrome rip = new RecursionIsPalindrome();
        boolean result = rip.isPalindrome("awesome");
        System.out.println(result);

    }

    public boolean isPalindrome(String s) {

        if (s.length() == 0 || s.length() == 1)
            return true;
        if (s.charAt(0) == s.charAt(s.length() - 1))
            return isPalindrome(s.substring(1, s.length() - 1));
        return false;
    }
}
