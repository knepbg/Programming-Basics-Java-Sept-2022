package P01FirstStepsInCoding.lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {

        // четене от конзолата
        Scanner scanner = new Scanner(System.in);

        // входиране на данни :
        // 1.	Броят на опаковките храна за кучета – цяло число в интервала [0… 100]
        // 2.	Броят на опаковките храна за котки –  цяло число в интервала [0… 100]
        int packagingForDogs = Integer.parseInt(scanner.nextLine());
        int packagingForCats = Integer.parseInt(scanner.nextLine());

        //константи :
        // 1. опаковка храна за кучета е на цена 2.50 лв
        // 2. опаковка храна за котки струва 4 лв.
        double priceForDogFood = 2.5;
        int priceForCatFood = 4;

        // обработка на данни

        double totalPriceForDog = priceForDogFood * packagingForDogs;
        int totalPriceForCatFood = priceForCatFood * packagingForCats;
        double totalPrice = totalPriceForCatFood + totalPriceForDog;

        // печатане на резолтата
        String currency = "lv.";

        System.out.println(String.format("%f %s", totalPrice, currency));

    }
}
