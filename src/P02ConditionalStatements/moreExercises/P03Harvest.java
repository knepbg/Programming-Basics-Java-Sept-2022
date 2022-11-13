package P02ConditionalStatements.moreExercises;

import java.util.Scanner;

public class P03Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        •	1ви ред: X кв.м е лозето – цяло число в интервала [10 … 5000]
//        •	2ри ред: Y грозде за един кв.м – реално число в интервала [0.00 … 10.00]
//        •	3ти ред: Z нужни литри вино – цяло число в интервала [10 … 600]
//        •	4ти ред: брой работници – цяло число в интервала [1 … 20]

        int area = Integer.parseInt(scanner.nextLine());
        double grapesProduce = Double.parseDouble(scanner.nextLine());
        int wineNeeded = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        // harvest = area * grapesProduce
        double harvest = area * grapesProduce;

        // grapes for wine  = 40 % * harvest
        double grapes = harvest * 0.4;

        // wine = grapes / 2.5
        double wine = grapes / 2.5;

        if (wine < wineNeeded) {
            double needed = Math.floor(wineNeeded - wine);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", needed);
        } else {
            double left = Math.ceil(wine - wineNeeded);
            double wineForWorkers = Math.ceil(left / workers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(wine));
            System.out.printf("%.0f liters left -> %.0f liters per person.", left, wineForWorkers);
        }
    }
}
