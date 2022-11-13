package P03ConditionalStatementsAdvanced.moreExercises;

import java.util.Scanner;

public class P02BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Първият ред – броят младши велосипедисти. Цяло число в интервала [1…100]
//        •	Вторият ред – броят старши велосипедисти. Цяло число в интервала [1… 100]
//        •	Третият ред – вид трасе – "trail", "cross-country", "downhill" или "road"

        int juniorsCount = Integer.parseInt(scanner.nextLine());
        int seniorsCount = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();
        double juniorPrice = 0.00;
        double seniorsPrice = 0.00;
        double tax = 0.00;


        switch (trace) {
            case "trail":
                juniorPrice = 5.50;
                seniorsPrice = 7;
                tax = juniorsCount * juniorPrice + seniorsCount * seniorsPrice;
                break;
            case "cross-country":
                juniorPrice = 8;
                seniorsPrice = 9.50;
                tax = juniorsCount * juniorPrice + seniorsCount * seniorsPrice;
                if (juniorsCount + seniorsCount >= 50) {
                    tax *= 0.75;
                }
                break;
            case "downhill":
                juniorPrice = 12.25;
                seniorsPrice = 13.75;
                tax = juniorsCount * juniorPrice + seniorsCount * seniorsPrice;
                break;
            case "road":
                juniorPrice = 20;
                seniorsPrice = 21.50;
                tax = juniorsCount * juniorPrice + seniorsCount * seniorsPrice;
                break;
        }
        tax *= 0.95;
        System.out.printf("%.2f", tax);

    }
}
