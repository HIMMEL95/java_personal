package java_personal.Baekjoon.InputOutput;

import java.util.Scanner;

class Surprise {
    
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        String word = stdIn.next();

        System.out.println(word + "??!");
        
        stdIn.close();
    }
}

