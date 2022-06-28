package java_personal.Udemy.Big_O;

class OQuadratic {

    public static void main(String[] args) {

        int[] custArray = {1, 2, 3, 4, 5};

        for (int i = 0; i < custArray.length; i++) {
            for (int j = 0; j < custArray.length; j++) {
                System.out.println(custArray[i]);
            }
        }
    }

    public int fibonacci(int n) {
        
        if (n == 0 || n == 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

