package java_personal.LeetCode.Algorithms;

class FinalValueOfVariableAfterPerformingOperations {

    public static int finalValueAfterOperations(String[] operations) {

        int sum = 0;
        for (int i = 0; i < operations.length; i++) {
            String str = operations[i];
            if (str.equals("--X") || str.equals("X--"))
                sum -= 1;
            else
                sum += 1;
        }

        return sum;
    }

    public static void main(String[] args) {
        
        String[] operations = {"--X", "X++", "X++"};
        System.out.println(finalValueAfterOperations(operations));
        String[] a = {"++X", "X++", "X++"};
        System.out.println(finalValueAfterOperations(a));
        String[] b = {"X++", "++X", "--X", "X--"};
        System.out.println(finalValueAfterOperations(b));
    }
}
