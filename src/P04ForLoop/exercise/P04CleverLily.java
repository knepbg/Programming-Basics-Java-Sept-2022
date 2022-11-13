package P04ForLoop.exercise;

import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int savedMoney = 0;
        int moneyRising = 1;

        int age = Integer.parseInt(scanner.nextLine());

        double washerPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int toyCount = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                savedMoney = savedMoney + (moneyRising * 10) - 1;
                moneyRising++;
            } else {
                toyCount++;
            }
        }

        double totalToyPrice = toyPrice * toyCount;
        double totalMoney = totalToyPrice + savedMoney;

        if (totalMoney >= washerPrice) {
            System.out.printf("Yes! %.2f", totalMoney - washerPrice);
        } else {
            System.out.printf("No! %.2f", washerPrice - totalMoney);
        }

    }
}
