package java_personal.Udemy.Big_O;

class BigOMultiplication {

    public static void main(String[] args) {

        int[] arrayA = {1, 2, 3, 4, 5};
        int[] arrayB = {6, 7, 8, 9, 10};

        for (int a = 0; a < arrayA.length; a++) {
            for (int b = 0; b < arrayB.length; b++) {
                System.out.println(arrayB[b] + arrayA[a]);
            }
        }
    }
}
