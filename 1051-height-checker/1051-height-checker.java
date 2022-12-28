class Solution {
    public int heightChecker(int[] heights) {
        int result = 0;
        int[] copyArr = Arrays.copyOf(heights, heights.length);

        int temp = 0;
        for (int i=0; i<heights.length; i++) {
            for (int j=i+1; j<heights.length; j++) {
                if (copyArr[i] > copyArr[j]) {
                    temp = copyArr[i];
                    copyArr[i] = copyArr[j];
                    copyArr[j] = temp;
                }
            }
        }

        for (int i=0; i<heights.length; i++) {
            if (heights[i] != copyArr[i]) result++;
        }
        return result;
    }
}