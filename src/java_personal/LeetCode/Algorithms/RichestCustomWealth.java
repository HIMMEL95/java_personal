package java_personal.LeetCode.Algorithms;

class RichestCustomWealth {

    public static int maximumWealth(int[][] accounts) {

        int len = accounts.length;
        int[] total = new int[len];

        for (int i = 0; i < len; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++)
                sum += accounts[i][j];
            total[i] = sum;
        }

        int max = 0;
        for (int i = 0; i < total.length; i++) {
            if (total[i] > max)
                max = total[i];
        }
        return max;
    }

    public static void main(String[] args) {

        int[][] accounts = { {1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(accounts));

        int[][] ac = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println(maximumWealth(ac));

        int[][] b = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        System.out.println(maximumWealth(b));
    }
}
