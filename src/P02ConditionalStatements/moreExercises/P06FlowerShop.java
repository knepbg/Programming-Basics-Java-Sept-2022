package P02ConditionalStatements.moreExercises;

import java.util.Scanner;

public class P06FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        •	Брой магнолии – цяло число в интервала [0 … 50]
//        •	Брой зюмбюли – цяло число в интервала [0 … 50]
//        •	Брой рози – цяло число в интервала [0 … 50]
//        •	Брой кактуси – цяло число в интервала [0 … 50]
//        •	Цена на подаръка – реално число в интервала [0.00 … 500.00]
        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double presentPrise = Double.parseDouble(scanner.nextLine());

//        •	Магнолии – 3.25 лева
//        •	Зюмбюли – 4 лева
//        •	Рози – 3.50 лева
//        •	Кактуси – 8 лева

        double magnoliasPrice = magnolias * 3.25;
        double hyacinthsPrice = hyacinths * 4.00;
        double rosesPrice = roses * 3.50;
        double cactusPrice = cactus * 8.00;

        // От общата сума, Мария трябва да плати 5% данъци.
        double totalFlowersPrice = (magnoliasPrice + hyacinthsPrice + rosesPrice + cactusPrice) * 0.95;


//        •	Ако парите СА стигнали: "She is left with {останали} leva." – сумата трябва да е закръглена към по-малко цяло число (пр. 1.90 -> 1).
//        •	Ако парите НЕ достигат: "She will have to borrow {останали} leva." – сумата трябва да е закръглена към по-голямо цяло число (пр. 1.10 -> 2).

        if (presentPrise <= totalFlowersPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(totalFlowersPrice - presentPrise));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(presentPrise - totalFlowersPrice));
        }
    }
}
