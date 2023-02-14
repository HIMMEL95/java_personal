package java_personal.Baekjoon.array;

import java.util.Scanner;

class Mod {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in); 

        int[] ModList = new int[10];
        boolean bl;

        for (int i = 0; i < 10; i++)
            ModList[i]  = stdIn.nextInt() % 42;

        int count = 0;
        for (int j = 0; j < 10; j++) {
            bl = false;
            for (int k = j+1; k < 10; k++) {
                if (ModList[j] == ModList[k]) {
                    bl = true;
                    break;
                }
            }
            if (bl == false)
                count++;
        }

        System.out.println(count);
            
        stdIn.close();
    }
}

