package P04ForLoop.lab;

import java.util.Scanner;

public class P07SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 1; i <= count; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum = sum + num;
        }
        System.out.println(sum);

    }
}
