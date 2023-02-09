package java_personal.Udemy.Big_O;

class BigOSumandProductOfArray {

    static void spofArray(int[] array) {
        int sum = 0;
        int product = 1;

        for (int i = 0; i < array.length; i++)
            sum += array[i];

        for (int i = 0; i < array.length; i++)
            product *= array[i];
        
        System.out.println(sum + ", " + product);
    }

    public static void main(String[] args) {
        
        int[] custArray = {1, 3, 4, 5};
        spofArray(custArray);
    }
}
