package ProgrammingBasicsOnlineExam22October2022;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        1.	Броят на хората в групата – цяло число в интервала [0 … 50]
//        2.	Броят на нощувките – цяло число в интервала [0 … 2000]
//        3.	Броят на картите за транспорт – цяло число в интервала [0… 2000]
//        4.	Броят на билетите за музеи – цяло число в интервала [0 … 2000]

        int peopleCount = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        int cardsCount = Integer.parseInt(scanner.nextLine());
        int ticketsCount = Integer.parseInt(scanner.nextLine());

        int nightsPrice = nights * 20;
        double cardsPrice = cardsCount * 1.6;
        int ticketsPrice = ticketsCount * 6;

        double totalPriceForOne = nightsPrice + cardsPrice + ticketsPrice;
        double totalPrice = (totalPriceForOne * peopleCount ) * 1.25;


        System.out.printf("%.2f", totalPrice);


    }
}
