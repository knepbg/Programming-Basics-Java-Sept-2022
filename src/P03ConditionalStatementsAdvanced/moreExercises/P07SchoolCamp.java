package P03ConditionalStatementsAdvanced.moreExercises;

import java.util.Scanner;

public class P07SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        3.	Брой на учениците – цяло число в интервала [1 … 10000];
//        4.	Брой на нощувките – цяло число в интервала [1 … 100].
        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int student = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0.00;
        String sport = "";

        if (season.equals("Winter")) {
            switch (group) {
                case "boys":
                case "girls":
                    totalPrice = student * 9.60 * nights;
                    break;
                case "mixed":
                    totalPrice = student * 10 * nights;
                    break;
            }
        } else if (season.equals("Spring")) {
            switch (group) {
                case "boys":
                case "girls":
                    totalPrice = student * 7.20 * nights;
                    break;
                case "mixed":
                    totalPrice = student * 9.50 * nights;
                    break;
            }
        } else if (season.equals("Summer")) {
            switch (group) {
                case "boys":
                case "girls":
                    totalPrice = student * 15 * nights;
                    break;
                case "mixed":
                    totalPrice = student * 20 * nights;
                    break;
            }
        }
        if (student >= 50) {
            totalPrice *= 0.5;
        } else if (student >= 20) {
            totalPrice *= 0.85;
        } else if (student >= 10) {
            totalPrice *= 0.95;
        }
        if (season.equals("Winter")) {
            switch (group) {
                case "boys":
                    sport = "Judo";
                    break;
                case "girls":
                    sport = "Gymnastics";
                    break;
                case "mixed":
                    sport = "Ski";
                    break;
            }
        } else if (season.equals("Spring")) {
            switch (group) {
                case "boys":
                    sport = "Tennis";
                    break;
                case "girls":
                    sport = "Athletics";
                    break;
                case "mixed":
                    sport = "Cycling";
                    break;
            }

        } else if (season.equals("Summer")) {
            switch (group) {
                case "boys":
                    sport = "Football";
                    break;
                case "girls":
                    sport = "Volleyball";
                    break;
                case "mixed":
                    sport = "Swimming";
                    break;
            }
        }
        System.out.printf("%s %.2f lv.", sport, totalPrice);
    }
}

//        1.	Сезонът – текст - “Winter”, “Spring” или “Summer”;
//        2.	Видът на групата – текст - “boys”, “girls” или “mixed”;