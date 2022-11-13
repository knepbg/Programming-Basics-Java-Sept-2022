package P03ConditionalStatementsAdvanced.moreExercises;

import java.util.Scanner;

public class P04CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Първи ред – Бюджет – реално число в интервала [10.00...10000.00]
//        •	Втори ред –  Сезон – текст "Summer" или "Winter"
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String carType = ""; // – "Cabrio" и "Jeep".
        String classes = "";
        double carPrice = 0.00;

        if (budget <= 100) {
            classes = "Economy class";
            if (season.equals("Summer")) {
                carType = "Cabrio";
                carPrice = budget * 0.35;
            } else if (season.equals("Winter")) {
                carType = "Jeep";
                carPrice = budget * 0.65;
            }
        } else if (budget > 100 && budget <= 500) {
            classes = "Compact class";
            if (season.equals("Summer")) {
                carType = "Cabrio";
                carPrice = budget * 0.45;
            } else if (season.equals("Winter")) {
                carType = "Jeep";
                carPrice = budget * 0.8;
            }
        } else if (budget > 500) {
            classes = "Luxury class";
            switch (season) {
                case "Winter":
                case "Summer":
                    carType = "Jeep";
                    carPrice = budget * 0.9;
                    break;
            }
        }
//        •	Първи ред – "{Вид на класа}"
//                o	"Economy class", "Compact class" или "Luxury class"
//        •	Втори ред – "{Вид на колата} - {цена на колата}"
//                o	Видът на колата – "Cabrio" или "Jeep"
//                o	Цената трябва да е форматирана до втория знак след запетаята
        System.out.printf("%s%n", classes);
        System.out.printf("%s - %.2f", carType, carPrice);

    }
}
