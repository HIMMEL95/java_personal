package java_personal.LeetCode.Algorithms;

class MaximumNumberofWordsFoundInSentences {

    public static int mostWordsFound(String[] sentences) {

        int len = sentences.length;
        int[] count = new int[len];

        for (int i = 0; i < len; i++) {
            int space = 0;
            String str = sentences[i];
            for (int j = 0; j < str.length(); j++) {
                char word = str.charAt(j);
                if (word == ' ')
                    space += 1;
            }
            count[i] = space;
        }
        
        int max = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) 
                max = count[i];
        }

        return (max+1);
    }

    public static void main(String[] args) {

        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));

        String[] a = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(a));
    }
}
