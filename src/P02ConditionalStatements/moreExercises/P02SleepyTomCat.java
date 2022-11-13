package P02ConditionalStatements.moreExercises;

import java.util.Scanner;

public class P02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // едно число – броят почивни дни – цяло число в интервала [0...365]
        int hollyDays = Integer.parseInt(scanner.nextLine());
        int tomPlayTime = 30000;

        // нормата за игра на Том е 30 000  минути в година
        // Том зависи от почивните дни на стопанина му:
        // •	Когато е на работа, стопанинът му си играе с него по 63 минути на ден.
        // •	Когато почива, стопанинът му си играе с него  по 127 минути на ден.
        // годината има 365 дни.

        // how much hours will be play on hollyDays - hollyDays * 127 min.-
        double gameOnHollyDays = hollyDays * 127;

        // how much will be play on working days - (365 - hollyDays ) * 63
        double gameOnWorkingDays = (365 - hollyDays) * 63;

        double totalPlayTime = gameOnHollyDays + gameOnWorkingDays;

        if (totalPlayTime > tomPlayTime) {
            double difference = totalPlayTime - tomPlayTime;
            double hours = Math.floor(difference / 60);
            double minutes = difference % 60;
            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play", hours, minutes);
        } else {
            double difference = tomPlayTime - totalPlayTime;
            double hours = Math.floor(difference / 60);
            double minutes = difference % 60;
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play", hours, minutes);
        }
    }
}
