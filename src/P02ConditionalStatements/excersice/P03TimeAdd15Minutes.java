package P02ConditionalStatements.excersice;

import java.util.Scanner;

public class P03TimeAdd15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // която чете час и минути от 24-часово
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        // колко ще е часът след 15 минути
        // формат часове:минути
        // минутите винаги са между 0 и 59.
        // Часовете винаги са между 0 и 23
        // Минутите се изписват винаги с по две цифри, с водеща нула, когато е необходимо.
        minutes = minutes + 15;
        if (minutes > 59) {
            hours = hours + 1;
            minutes = minutes - 60;
        }
        if (hours > 23) {
            hours = hours - 24;
        }

        if (minutes < 10) {
            System.out.printf("%d:0%d", hours, minutes);
        } else {
            System.out.printf("%d:%d", hours, minutes);
        }

    }
}
