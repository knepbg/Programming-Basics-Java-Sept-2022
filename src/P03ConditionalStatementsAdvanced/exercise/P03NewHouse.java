package P03ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Вид цветя - текст с възможности - "Roses", "dahlias", "tulips", "narcissus", "gladiolus"
//        •	Брой цветя - цяло число в интервала [10…1000]
//        •	Бюджет - цяло число в интервала [50…2500]
        String flower = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double roses = 5.00;
        double dahlias = 3.80;
        double tulips = 2.80;
        double narcissus = 3.00;
        double gladiolus = 2.50;

        double totalPrice = 0.00;

        switch (flower) {
            case "Roses":
                totalPrice = count * roses;
                break;
            case "Dahlias":
                totalPrice = count * dahlias;
                break;
            case "Tulips":
                totalPrice = count * tulips;
                break;
            case "Narcissus":
                totalPrice = count * narcissus;
                break;
            case "Gladiolus":
                totalPrice = count * gladiolus;
                break;
        }

        // - 10% отстъпка от крайната цена
        if (flower.equals("Roses")) {
            if (count > 80) {
                totalPrice *= 0.9;
            }
        }
        // 90  Далии - 15% отстъпка от крайната
        if (flower.equals("Dahlias")) {
            if (count > 90) {
                totalPrice *= 0.85;
            }
        }

        //повече от 80 Лалета - 15% отстъпка от крайната
        if (flower.equals("Tulips")) {
            if (count > 80) {
                totalPrice *= 0.85;
            }
        }

        // по-малко от 120 Нарциса - цената се оскъпява с 15%
        if (flower.equals("Narcissus")) {
            if (count < 120) {
                totalPrice *= 1.15;
            }
        }

        // Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%
        if (flower.equals("Gladiolus")) {
            if (count < 80) {
                totalPrice *= 1.2;
            }
        }
        // •	Ако бюджета им е достатъчен - "Hey, you have a great garden with {броя цвета} {вид цветя} and {останалата сума} leva left."
        // •	Ако бюджета им е НЕ достатъчен - "Not enough money, you need {нужната сума} leva more."

        if (budget >= totalPrice) {
            double left = budget - totalPrice;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flower, left);
        } else {
            double needed = totalPrice - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", needed);
        }
    }
}
