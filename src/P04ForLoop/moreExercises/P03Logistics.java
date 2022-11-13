package P04ForLoop.moreExercises;

import java.util.Scanner;

public class P03Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	На първия ред – броя на товарите за превоз – цяло число в интервала [1...1000]
//        •	За всеки един товар на отделен ред – тонажа на товара – цяло число в интервала [1...1000]
        int counter = Integer.parseInt(scanner.nextLine());
        int microBus = 0;
        int truck = 0;
        int train = 0;
        int totalWeight = 0;
        double averagePrice = 0;


        for (int i = 1; i <= counter; i++) {
            int weight = Integer.parseInt(scanner.nextLine());
            totalWeight += weight;

            if (weight <= 3) {
                microBus += weight;
            } else if (weight <= 11) {
                truck += weight;
            } else {
                train += weight;
            }
        }
        averagePrice = (microBus * 200 + truck * 175 + train * 120) * 1.0 / totalWeight;
        double busPercent = microBus * 1.0 / totalWeight * 100;
        double truckPercent = truck * 1.0 / totalWeight * 100;
        double trainPercent = train * 1.0 / totalWeight * 100;

        System.out.printf("%.2f%n", averagePrice);
        System.out.printf("%.2f%%%n", busPercent);
        System.out.printf("%.2f%%%n", truckPercent);
        System.out.printf("%.2f%%%n", trainPercent);
    }
}
