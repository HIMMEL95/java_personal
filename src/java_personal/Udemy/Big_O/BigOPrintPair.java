package java_personal.Udemy.Big_O;

class BigOPrintPair {

    static void printPairs(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + "" + array[j]);
            }
        }

    }

    public static void main(String[] args) {

        int[] customArray = {1, 3, 4, 5};
        printPairs(customArray);
    }
}
