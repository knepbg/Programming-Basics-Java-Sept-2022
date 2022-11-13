package P03ConditionalStatementsAdvanced.moreExercises;

import java.util.Scanner;

public class P06TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Първи ред – Сезон – текст "Spring", "Summer", "Autumn" или "Winter"
//        •	Втори ред –  Километри на месец – реално число в интервала [10.00...20000.00]
        String season = scanner.nextLine();
        double kilometers = Double.parseDouble(scanner.nextLine());
        double sum = 0.00;

        if (kilometers <= 5000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    sum = kilometers * 0.75;
                    break;
                case "Summer":
                    sum = kilometers * 0.90;
                    break;
                case "Winter":
                    sum = kilometers * 1.05;
                    break;
            }
        } else if (kilometers > 5000 && kilometers <= 10000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    sum = kilometers * 0.95;
                    break;
                case "Summer":
                    sum = kilometers * 1.10;
                    break;
                case "Winter":
                    sum = kilometers * 1.25;
                    break;
            }
        } else if (kilometers > 10000 && kilometers <= 20000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                case "Summer":
                case "Winter":
                    sum = kilometers * 1.45;
                    break;
            }
        }
        sum = (sum * 4) * 0.9;
        System.out.printf("%.2f", sum);
    }
}
