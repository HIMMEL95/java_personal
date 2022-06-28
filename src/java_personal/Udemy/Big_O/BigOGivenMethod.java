package java_personal.Udemy.Big_O;

class BigOGivenMethod {

    static void printUnorderedPairs (int[] arrayA, int[] arrayB) {
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i] < arrayB[j])
                    System.out.println(arrayA[i] + "" + arrayB[j]);
            }
        }
    }

    public static void main(String[] args) {

        int[] A = {0, 1, 2, 3, 4};
        int[] B = {5, 6, 7, 8, 9};

        printUnorderedPairs(A, B);
    }
}
