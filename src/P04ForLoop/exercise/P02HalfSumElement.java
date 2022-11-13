package P04ForLoop.exercise;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        // 1. сум.
        // 2. намир. кое е най-голямото
        // 3. изваждам го от общите
        // 4. Ако отговора е 0 Yes
        // no

        int sum = 0;
        int numMax = Integer.MIN_VALUE;

        for (int i = 1; i <= count; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum = sum + num;
            if (num > numMax) {
                numMax = num;
            }
        }

        if (sum - numMax == numMax) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", numMax);
        } else {
            sum = sum - numMax;
            int result = Math.abs(numMax - sum);
            System.out.println("No");
            System.out.printf("Diff = %d", result);
        }
    }
}
