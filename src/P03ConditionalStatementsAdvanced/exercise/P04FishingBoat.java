package P03ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Бюджет на групата – цяло число в интервала [1…8000]
//        •	Сезон –  текст : "Spring", "Summer", "Autumn", "Winter"
//        •	Брой рибари – цяло число в интервала [4…18]

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0.00;

        // кораба през пролетта е  3000 лв.
        // лятото и есента е  4200 лв.
        // зимата е  2600 лв.

//        •	Ако групата е до 6 човека включително  –  отстъпка от 10%.
//        •	Ако групата е от 7 до 11 човека включително  –  отстъпка от 15%.
//        •	Ако групата е от 12 нагоре  –  отстъпка от 25%.

//        5% отстъпка ако са четен брой освен ако не е есен

        switch (season) {
            case "Spring":
                totalPrice = 3000;
                if (count > 0 && count <= 6) {
                    totalPrice *= 0.9;
                }
                if (count > 6 && count <= 11) {
                    totalPrice *= 0.85;
                }
                if (count > 11) {
                    totalPrice *= 0.75;
                }
                if (count % 2 == 0) {
                    totalPrice *= 0.95;
                }
                break;
            case "Summer":
            case "Autumn":
                totalPrice = 4200;
                if (count > 0 && count <= 6) {
                    totalPrice *= 0.9;
                }
                if (count > 6 && count <= 11) {
                    totalPrice *= 0.85;
                }
                if (count > 11) {
                    totalPrice *= 0.75;
                }
                if (count % 2 == 0 && !season.equals("Autumn")) {
                    totalPrice *= 0.95;
                }
                break;
            case "Winter":
                totalPrice = 2600;
                if (count > 0 && count <= 6) {
                    totalPrice *= 0.9;
                }
                if (count > 6 && count <= 11) {
                    totalPrice *= 0.85;
                }
                if (count > 11) {
                    totalPrice *= 0.75;
                }
                if (count % 2 == 0) {
                    totalPrice *= 0.95;
                }
                break;
        }
//        •	Ако бюджетът е достатъчен:
//        "Yes! You have {останалите пари} leva left."
//        •	Ако бюджетът НЕ Е достатъчен:
//                "Not enough money! You need {сумата, която не достига} leva."

        if (budget >= totalPrice) {
            double left = budget - totalPrice;
            System.out.printf("Yes! You have %.2f leva left.", left);
        } else {
            double needed = totalPrice - budget;
            System.out.printf("Not enough money! You need %.2f leva.", needed);
        }

    }
}
