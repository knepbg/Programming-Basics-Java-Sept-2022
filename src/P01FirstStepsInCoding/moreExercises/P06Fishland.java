package P01FirstStepsInCoding.moreExercises;

import java.util.Scanner;

public class P06Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // четене :
//
//        •	Първи ред – цена на скумрията. mackerel
//        •	Втори ред – цена на цацата. sprinkle
//        •	Трети ред – килограма паламуд. bonito
//        •	Четвърти ред – килограма сафрид.
//        •	Пети ред – килограма миди.
        double mackerelPrice = Double.parseDouble(scanner.nextLine());
        double sprinklePrice = Double.parseDouble(scanner.nextLine());
        double bonito = Double.parseDouble(scanner.nextLine());
        double safrid = Double.parseDouble(scanner.nextLine());
        double mussels = Double.parseDouble(scanner.nextLine());

        // •	Паламуд – 60% по-скъп от скумрията :
        double bonitoPrice = mackerelPrice + (mackerelPrice * 0.6);

        // •	Сафрид – 80% по-скъп от цацата
        double safridPrice = sprinklePrice + (sprinklePrice * 0.8);

        // •	Миди – 7.50 лв. за килограм
        double musselsPrice = 7.5;

        // колко пари ще са нужни на Георги, за да си плати сметката.
        // Числото трябва да е форматирано до вторият знак след десетичната запетая (1.2457 -> 1.25). Math.ceil(double)

        // тотална цена = Сума паламуд (bonito)  + Сума сафрид + Сума миди :
        double totalPriceBonito = bonito * bonitoPrice;
        double totalPriceSafrid = safrid * safridPrice;
        double totalPriceMussels = mussels * musselsPrice;

        double totalPrice = totalPriceBonito + totalPriceMussels + totalPriceSafrid;

        System.out.printf("%.2f", totalPrice);

    }
}
