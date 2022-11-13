package P04ForLoop.moreExercises;

import java.util.Scanner;

public class P06Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Първи ред – месеците за които се търси средният разход – цяло число в интервала [1...100]
//        •	За всеки месец – сметката за ток – реално число в интервала [1.00...1000.00]
        int monthCount = Integer.parseInt(scanner.nextLine());

        double totalElectricity = 0.00;
        double totalWater = monthCount * 20;
        double totalInternet = monthCount * 15;

        for (int i = 1; i <= monthCount; i++) {
            double bills = Double.parseDouble(scanner.nextLine());
            totalElectricity += bills;
        }

        double othersPrice = (totalElectricity + totalWater + totalInternet) * 1.2;
        double average = (totalElectricity + totalWater + totalInternet + othersPrice) / monthCount;

        System.out.printf("Electricity: %.2f lv%n", totalElectricity);
        System.out.printf("Water: %.2f lv%n", totalWater);
        System.out.printf("Internet: %.2f lv%n", totalInternet);
        System.out.printf("Other: %.2f lv%n", othersPrice);
        System.out.printf("Average: %.2f lv%n", average);
    }
}
