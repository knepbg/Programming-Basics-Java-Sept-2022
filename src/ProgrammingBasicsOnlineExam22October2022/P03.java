package ProgrammingBasicsOnlineExam22October2022;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        1.	Брой танцьори – цяло число в интервала [1 … 10]
//        2.	Брой точки – реално число в интервала [1.00 … 10000.00]
//        3.	Сезон –  текст със следните възможности - "summer" или "winter"
//        4.	Място – текст със следните възможности - "Bulgaria" или "Abroad"

        int dancerCount = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();

        double price = 0.00;

        switch (place) {
            case "Bulgaria":
                price = points * dancerCount;
                if (season.equals("summer")) {
                    price = price * 0.95;
                } else {
                    price = price * 0.92;
                }
                break;
            case "Abroad":
                price = (points * dancerCount) + ((points * dancerCount) * 0.5);
                if (season.equals("summer")) {
                    price = price * 0.9;
                } else {
                    price = price * 0.85;
                }
                break;
        }

        double donation = price * 0.75;
        double unitPrice = (price - donation) / dancerCount;

        System.out.printf("Charity - %.2f%n", donation);
        System.out.printf("Money per dancer - %.2f", unitPrice);

    }
}
