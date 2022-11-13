package P04ForLoop.lab;

import java.util.Scanner;

public class P08NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int numMax = Integer.MIN_VALUE;
        int numMin = Integer.MAX_VALUE;

        for (int i = 1; i <= count; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num > numMax) {
                numMax = num;
            }
            if (num < numMin) {
                numMin = num;
            }
        }
        System.out.println(String.format("Max number: %d", numMax));
        System.out.println(String.format("Min number: %d", numMin));
    }
}
