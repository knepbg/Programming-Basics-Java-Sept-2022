package P03ConditionalStatementsAdvanced.moreExercises;

import java.util.Scanner;

public class P01MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // •	IP – 499.99 лева.
        // •	Normal – 249.99 лева.

//        •	На първия ред е бюджетът – реално число в интервала [1 000.00 ... 1 000 000.00]
//        •	На втория ред е категорията – "VIP" или "Normal"
//        •	На третия ред е броят на хората в групата – цяло число в интервала [1 ... 200]
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0.00;
        double sumLeft = 0.00;


        if (count >= 1 && count <= 4) {
            budget *= 0.25;
        } else if (count >= 5 && count <= 9) {
            budget *= 0.4;
        } else if (count >= 10 && count <= 24) {
            budget *= 0.5;
        } else if (count >= 25 && count <= 49) {
            budget *= 0.6;
        } else {
            budget *= 0.75;
        }
        if (category.equals("VIP")) {
            totalPrice = 499.99 * count;
            sumLeft = budget - totalPrice;
            if (sumLeft >= 0) {
                System.out.printf("Yes! You have %.2f leva left.", sumLeft);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", totalPrice - budget);
            }
        } else if (category.equals("Normal")) {
            totalPrice = 249.99 * count;
            sumLeft = budget - totalPrice;
            if (sumLeft >= 0) {
                System.out.printf("Yes! You have %.2f leva left.", sumLeft);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", totalPrice - budget);
            }
        }

    }
}
