package P02ConditionalStatements.moreExercises;

import java.util.Scanner;

public class P08FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Типа на горивото – текст с възможности: "Gas", "Gasoline" или "Diesel"
//        •	Количество гориво – реално число в интервала [1.00 … 50.00]
//        •	Притежание на клубна карта – текст с възможности: "Yes" или "No"
        String fuelType = scanner.nextLine();
        double liters = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();

//        •	Бензин – 2.22 лева за един литър,
//        •	Дизел – 2.33 лева за един литър
//        •	Газ – 0.93 лева за литър

        double gasolinePrice = 2.22;
        double dieselPrice = 2.33;
        double gasPrice = 0.93;

        // 18 ст. за литър бензин, 12 ст. за литър дизел и 8 ст. за литър газ.
        if ("Yes".equals(card)) {
            gasolinePrice -= 0.18;
            dieselPrice -= 0.12;
            gasPrice -= 0.08;
        }
        double totalPrice = 0.00;

        switch (fuelType) {
            case "Gas":
                totalPrice = liters * gasPrice;
                break;
            case "Gasoline":
                totalPrice = liters * gasolinePrice;
                break;

            case "Diesel":
                totalPrice = liters * dieselPrice;
                break;
        }

        if (liters > 20 && liters <= 25) {
            totalPrice *= 0.92;
        } else if (liters > 25) {
            totalPrice *= 0.9;
        }

        System.out.printf("%.2f lv.", totalPrice);
    }
}
