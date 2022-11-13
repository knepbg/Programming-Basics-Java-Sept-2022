package P03ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class P09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Първи ред - дни за престой - цяло число в интервала [0...365]
//        •	Втори ред - вид помещение - "room for one person", "apartment" или "president apartment"
//        •	Трети ред - оценка - "positive"  или "negative"
        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String great = scanner.nextLine();
        int nights = days - 1;
        double price = 0.00;

//        	"room for one person" – 18.00 лв за нощувка
//        	"apartment" – 25.00 лв за нощувка
//        	"president apartment" – 35.00 лв за нощувка

        switch (roomType) {
            case "room for one person":
                if (days > 0 && days < 10) {
                    price = nights * 18.00;
                } else if (days >= 10 && days <= 15) {
                    price = nights * 18.00;
                } else {
                    price = nights * 18.00;
                }
                break;
            case "apartment":
                if (days > 0 && days < 10) {
                    price = nights * 25.00 * 0.7;
                } else if (days >= 10 && days <= 15) {
                    price = nights * 25.00 * 0.65;
                } else {
                    price = nights * 25.00 * 0.5;
                }
                break;
            case "president apartment":
                if (days > 0 && days < 10) {
                    price = (nights * 35.00) * 0.9;
                } else if (days >= 10 && days <= 15) {
                    price = nights * 35.00 * 0.85;
                } else {
                    price = nights * 35.00 * 0.8;
                }
                break;
        }

        if (great.equals("positive")) {
            price *= 1.25;
        } else if (great.equals("negative")) {
            price *= 0.9;
        }

        System.out.printf("%.2f", price);

    }
}
