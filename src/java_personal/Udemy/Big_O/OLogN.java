package java_personal.Udemy.Big_O;

class OLogN {

    public static void main(String[] args) {

        int[] custArray = {1, 2, 3, 4, 5};

        for (int i = 0; i < custArray.length; i+=3)
            System.out.println(custArray[i]);

    }
}

