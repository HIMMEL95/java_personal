package java_personal.Udemy.Recursion;

class RecursionReverse {

    public static void main(String[] args) {

        RecursionReverse rr = new RecursionReverse();
        String result = rr.reverse("java");
        System.out.println(result);

    }

    public String reverse(String str) {

        if (str.isEmpty())
            return str;

        return reverse(str.substring(1)) + str.charAt(0);
    }
}
