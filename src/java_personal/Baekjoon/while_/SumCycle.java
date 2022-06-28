import java.util.Scanner;

class SumCycle {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();

        int count = 0;
        int result = n;
        
        while (true) {
            int a = result / 10;
            int b = result % 10;

            result = b*10 + (a + b) % 10;
            count++;

            if (result == n)
                break;
        }
        System.out.println(count);
    }
}

