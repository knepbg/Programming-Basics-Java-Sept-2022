package P03ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Първи ред – Бюджет, реално число в интервала [10.00...5000.00].
//        •	Втори ред –  Един от двата възможни сезона: "summer" или "winter"
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double totalSum = 0.00;
        String destination = "";
        String kindOfHollyDays = "";

//        •	При 100лв. или по-малко – някъде в България
//           o	Лято – 30% от бюджета
//           o	Зима – 70% от бюджета
        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                totalSum = budget * 0.3;
                kindOfHollyDays = "Camp";
            } else if (season.equals("winter")) {
                totalSum = budget * 0.7;
                kindOfHollyDays = "Hotel";
            }
        }
//        •	При 1000лв. или по малко – някъде на Балканите
//        o	Лято – 40% от бюджета
//        o	Зима – 80% от бюджета

        if (budget > 100 && budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                totalSum = budget * 0.4;
                kindOfHollyDays = "Camp";
            } else if (season.equals("winter")) {
                totalSum = budget * 0.8;
                kindOfHollyDays = "Hotel";
            }
        }
//        •	При повече от 1000лв. – някъде из Европа
//          o	При пътуване из Европа, независимо от сезона ще похарчи 90% от бюджета.
        if (budget > 1000) {
            destination = "Europe";
            if (season.equals("summer") || season.equals("winter")) {
                totalSum = budget * 0.9;
                kindOfHollyDays = "Hotel";
            }
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", kindOfHollyDays, totalSum);
    }
}
