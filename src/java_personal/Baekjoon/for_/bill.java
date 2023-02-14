package java_personal.Baekjoon.for_;

import java.util.Scanner;

public class bill {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("최종 금액을 입력 하세요! : ");
        int total = sc.nextInt();
        System.out.print("물건 종류의 수를 입력 하세요! : ");
        int find = sc.nextInt();

        int sum = 0;
        for (int i=0; i<find; i++) {
            System.out.print("상품의 금액을 입력 하세요! : ");
            int price = sc.nextInt();
            System.out.print("상품의 수량을 입력 하세요! : ");
            int count = sc.nextInt();

            sum += price * count;
        }

        if (total == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
