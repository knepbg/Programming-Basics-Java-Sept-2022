package P03ConditionalStatementsAdvanced.moreExercises;

import java.util.Scanner;

public class P05Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Първи ред – Бюджет – реално число в интервала [10.00...10000.00]
//        •	Втори ред –  Сезон – текст "Summer" или "Winter"
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String stays = "";
        String location = "";
        double cost = 0.00;

        if (budget <= 1000) {
            stays = "Camp";
            switch (season) {
                case "Summer":
                    location = "Alaska";
                    cost = budget * 0.65;
                    break;
                case "Winter":
                    location = "Morocco";
                    cost = budget * 0.45;
                    break;
            }
        } else if (budget > 1000 && budget <= 3000) {
            stays = "Hut";
            switch (season) {
                case "Summer":
                    location = "Alaska";
                    cost = budget * 0.8;
                    break;
                case "Winter":
                    location = "Morocco";
                    cost = budget * 0.6;
                    break;
            }

        } else if (budget > 3000) {
            stays = "Hotel";
            cost = budget * 0.9;
            switch (season) {
                case "Summer":
                    location = "Alaska";
                    break;
                case "Winter":
                    location = "Morocco";
                    break;
            }
        }
        System.out.printf("%s - %s - %.2f", location, stays, cost);
    }
}
