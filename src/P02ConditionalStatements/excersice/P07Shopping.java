package P02ConditionalStatements.excersice;

import java.util.Scanner;

public class P07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        1.	Бюджетът на Петър - реално число в интервала [0.0…100000.0]
//        2.	Броят видеокарти - цяло число в интервала [0…100]
//        3.	Броят процесори - цяло число в интервала [0…100]
//        4.	Броят рам памет - цяло число в интервала [0…100]

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

//        •	Видеокарта – 250 лв./бр.
//        •	Процесор – 35% от цената на закупените видеокарти/бр.
//        •	Рам памет – 10% от цената на закупените видеокарти/бр.
//        Ако броя на видеокартите е по-голям от този на процесорите получава 15% отстъпка от крайната сметка.

        double videoCardPrice = 250.00;
        double processorsPrice = (videoCardPrice * videoCards) * 0.35;
        double ramPrice = (videoCardPrice * videoCards) * 0.10;
        double totalPrice = videoCardPrice * videoCards + processorsPrice * processors + ramPrice * ram;

        if (videoCards > processors) {
            totalPrice = totalPrice * 0.85;
        }

//        •	Ако бюджета е достатъчен:
//                "You have {остатъчен бюджет} leva left!"
//        •	Ако сумата надхвърля бюджета:
//                "Not enough money! You need {нужна сума} leva more!"

        if (budget >= totalPrice) {
            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - budget);
        }
    }
}
