package P02ConditionalStatements.moreExercises;

import java.util.Scanner;

public class P04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // entre
//        •	Първият ред съдържа числото n – брой километри – цяло число в интервала [1…5000]
//        •	Вторият ред съдържа дума “day” или “night” – пътуване през деня или през нощта
        int kilometers = Integer.parseInt(scanner.nextLine());
        String period = scanner.nextLine();

        double taxiPrice = 0.00;
        double bussPrice = 0.00;
        double trainPrice = 0.00;
        double cheapestTicked = 0.00;

        if (period.equals("day")) {
            taxiPrice = 0.7 + (0.79 * kilometers);
        } else if (period.equals("night")) {
            taxiPrice = 0.7 + (0.90 * kilometers);
        }

        if (kilometers >= 100) {
            trainPrice = 0.06 * kilometers;
            bussPrice = 0.09 * kilometers;
            double min = Math.min(trainPrice, bussPrice);
            cheapestTicked = Math.min(trainPrice, min);
        } else if (kilometers >= 20) {
            bussPrice = 0.09 * kilometers;
            cheapestTicked = Math.min(bussPrice, taxiPrice);
        } else {
            cheapestTicked = taxiPrice;
        }

        System.out.printf("%.2f", cheapestTicked);

    }
}
