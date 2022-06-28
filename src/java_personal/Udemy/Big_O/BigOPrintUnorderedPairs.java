package java_personal.Udemy.Big_O;

class BigOPrintUnorderedPairs {

    static void printUnorderedPairs(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                System.out.println(array[i] + "" + array[j]);
            }
        }
    }

    public static void main(String[] args) {

        int[] custArray = {1, 3, 4, 5};
        printUnorderedPairs(custArray);
    }
}
