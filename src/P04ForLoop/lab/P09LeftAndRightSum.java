package P04ForLoop.lab;

import java.util.Scanner;

public class P09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int sum1 = 0;
        int sum2 = 0;


        for (int i = 1; i <= count; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum1 = sum1 + num;
        }
        for (int i = 1; i <= count; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum2 = sum2 + num;
        }

        if (sum1 == sum2) {
            System.out.printf("Yes, sum = %d", sum2);
        } else {
            int abs = Math.abs(sum1 - sum2);
            System.out.printf("No, diff = %d", abs);
        }


    }
}
