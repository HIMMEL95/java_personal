import java.util.Scanner;

class SumAB5 {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        while (true) {
            int a = stdIn.nextInt();
            int b = stdIn.nextInt();

            if (a == 0 && b == 0)
                break;

            System.out.println(a + b);
        }

        stdIn.close();
    }
}

