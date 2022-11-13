package ProgrammingBasicsOnlineExam20And21April2019;

import java.util.Scanner;

public class P06EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        От конзолата първоначално се чете един ред:
//        •	Брои на клиентите в магазина – цяло число [1… 100]
//        •	След това за всеки един клиент на нов ред до получаване на командата "Finish" се чете:
//                o	Покупката която клиента е избрал – текст ("basket", "wreath" или "chocolate bunny")

        int peopleCunt = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0.00;

        for (int i = 1; i <= peopleCunt; i++) {
            String purchase = scanner.nextLine();
            int itemsCount = 0;
            double midlSum = 0.00;

            while (!purchase.equals("Finish")) {
                switch (purchase) {
                    case "basket":
                        midlSum += 1.50;
                        itemsCount++;
                        break;
                    case "wreath":
                        midlSum += 3.80;
                        itemsCount++;
                        break;
                    case "chocolate bunny":
                        midlSum += 7;
                        itemsCount++;
                        break;
                }
                purchase = scanner.nextLine();
            }
            if (itemsCount % 2 == 0) {
                midlSum *= 0.8;
            }
            totalPrice += midlSum;
            System.out.printf("You purchased %d items for %.2f leva.%n", itemsCount, midlSum);
        }

        double average = totalPrice / peopleCunt;
        System.out.printf("Average bill per client is: %.2f leva.", average);
    }
}
