package P04ForLoop.lab;

import java.util.Scanner;

public class P10OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= count; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                evenSum = evenSum + num;
            } else {
                oddSum = oddSum + num;
            }
        }

        if (evenSum == oddSum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", evenSum);
        } else {
            int abs = Math.abs(evenSum - oddSum);
            System.out.println("No");
            System.out.printf("Diff = %d", abs);
        }
    }
}
