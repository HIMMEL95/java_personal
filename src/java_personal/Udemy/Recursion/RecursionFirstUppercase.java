package java_personal.Udemy.Recursion;

class RecursionFirstUppercase {

    public static void main(String[] args) {

        int result = RecursionFirstUppercase.first("appmillerS");
        System.out.println(result);

    }

    public static char first(String str) {
        
        if (str.isEmpty()) 
            return ' ';
        if (Character.isUpperCase(str.charAt(0)))
            return str.charAt(0);
        else
            return first(str.substring(1, str.length()));
    }
}

