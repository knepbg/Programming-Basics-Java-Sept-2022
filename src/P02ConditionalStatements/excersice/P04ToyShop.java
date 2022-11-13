package P02ConditionalStatements.excersice;

import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        1.	Цена на екскурзията - реално число в интервала [1.00 … 10000.00]
//        2.	Брой пъзели - цяло число в интервала [0… 1000]
//        3.	Брой говорещи кукли - цяло число в интервала [0 … 1000]
//        4.	Брой плюшени мечета - цяло число в интервала [0 … 1000]
//        5.	Брой миньони - цяло число в интервала [0 … 1000]
//        6.	Брой камиончета - цяло число в интервала [0 … 1000]

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int bearsCount = Integer.parseInt(scanner.nextLine());
        int miniounsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());
        double totalPrice = puzzleCount * 2.60 + dollsCount * 3 + bearsCount * 4.10 + miniounsCount * 8.2 + trucksCount * 2;

//        •	Пъзел - 2.60 лв.
//        •	Говореща кукла - 3 лв.
//        •	Плюшено мече - 4.10 лв.
//        •	Миньон - 8.20 лв.
//        •	Камионче - 2 лв.

        // Ако поръчаните играчки са 50 или повече магазинът прави отстъпка 25% от общата цена.
        // От спечелените пари Петя трябва да даде 10% за наема на магазина.
        // Да се пресметне дали парите ще ѝ стигнат да отиде на екскурзия.

        int toyCount = puzzleCount + dollsCount + bearsCount + miniounsCount + trucksCount;
        if (toyCount >= 50) {
            totalPrice = totalPrice * 0.75;
        }

        totalPrice = totalPrice * 0.9; // за наема

        // •	Ако парите са достатъчни се отпечатва:
        //     o	"Yes! {оставащите пари} lv left."
        //•	Ако парите НЕ са достатъчни се отпечатва:
        //     o	"Not enough money! {недостигащите пари} lv needed."

        if (totalPrice >= excursionPrice) {
            System.out.printf("Yes! %.2f lv left.", totalPrice - excursionPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", excursionPrice - totalPrice);
        }

    }
}
