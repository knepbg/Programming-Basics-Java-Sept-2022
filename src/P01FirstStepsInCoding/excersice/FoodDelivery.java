package P01FirstStepsInCoding.excersice;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //входиране на данни :
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        //Пресмятане :
        // 1. (double))пресмятане на общата цена на Пилешко меню = входни данни (int) * 10.35
        // 2. (double)пресмятане на общата цена на Меню с риба = входни данни(int)* 12.40
        // 3. (double)пресмятане на общата цена на Вегетарианско меню   = входни данни(int) * 8.15
        // 4. (double)пресмятане на десет = 20% от общата сметка (без доставката)
        // 5. (double)Доставка = 2.50 лв и се начислява най-накрая.
        double totalPriceChickenMenu = chickenMenu * 10.35;
        double totalPriceFishMenu = fishMenu * 12.40;
        double totalPriceVegetarianMenu = vegetarianMenu * 8.15;
        double desert = (totalPriceFishMenu + totalPriceVegetarianMenu + totalPriceChickenMenu) * 0.2;
        double totalPrice = totalPriceChickenMenu + totalPriceFishMenu + totalPriceVegetarianMenu + desert + 2.5;

        // printing result
        System.out.println(totalPrice);

    }
}
