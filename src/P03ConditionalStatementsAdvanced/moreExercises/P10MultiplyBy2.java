package P03ConditionalStatementsAdvanced.moreExercises;

import java.util.Scanner;

public class P10MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // поредица от реални числа,
        double num = Double.parseDouble(scanner.nextLine());

        while (num >= 0) {
            double multiple = num * 2;
            System.out.printf("Result: %.2f%n", multiple);

            num = Double.parseDouble(scanner.nextLine());
        }

        System.out.println("Negative number!");


    }
}
