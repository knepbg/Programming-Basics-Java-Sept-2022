package P02ConditionalStatements.lab;

import java.util.Scanner;

public class P03EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // , която чете цяло число
        int num = Integer.parseInt(scanner.nextLine());

        // дали е четно или нечетно.
        boolean isEven = num % 2 == 0;

        // четно отпечатайте "even", ако е нечетно "odd".
        if (isEven) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
