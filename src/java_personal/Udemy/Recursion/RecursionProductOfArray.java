package java_personal.Udemy.Recursion;

class RecursionProductOfArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        RecursionProductOfArray rpoa = new RecursionProductOfArray();
        int result = rpoa.productofArray(arr, arr.length);
        System.out.println(result);

    }

    public int productofArray(int A[], int N) {

        if (N <= 0)
            return 1;
        return (productofArray(A, N - 1) * A[N - 1]);
    }
}
