package java_personal.Udemy.Array;

class InsertionPrintArray {

    public static void main(String[] args) {

        SingleDimensionArray sda = new SingleDimensionArray(3);

        sda.insert(0, 10);
        sda.insert(1, 20);
        sda.insert(2, 30);

        int firstElement = sda.arr[0];
        System.out.println(firstElement);

        int thirdElement = sda.arr[2];
        System.out.println(thirdElement);
    }
}
