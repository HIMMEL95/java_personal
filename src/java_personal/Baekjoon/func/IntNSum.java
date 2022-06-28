package java_personal.Baekjoon.func;

class IntNSum {

    long sum(int[] a) {

        long sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i];

        return sum;
    }
}

