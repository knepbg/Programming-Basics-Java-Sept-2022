package ProgrammingBasicsOnlineExam20And21April2019;

import java.util.Scanner;

public class P04EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	На първи ред - Началното количество яйца в магазина - цяло число в интервала [1… 10000]
//        •	След това поредица от два реда (до получаване на команда "Close" или при заявка за купуване на повече от наличните в магазина яйца) :
//                o	Команда за купуване или допълване на яйца в магазина – текст ("Buy" или "Fill")
//                o	Брой на яйца, които да бъдат купени или допълнени в магазина – цяло число в интервала
//        [1… 1000]

        int totalCountOfEggs = Integer.parseInt(scanner.nextLine());
        int eggsLeft = totalCountOfEggs;
        int eggsSold = 0;
        boolean isEnough = true;

        for (int i = 1; i <= totalCountOfEggs; i++) {
            if (!isEnough) {
                System.out.println("Not enough eggs in store!");
                System.out.printf("You can buy only %d.%n", eggsLeft);
                break;
            }
            String command = scanner.nextLine();
            if (command.equals("Close")) {
                System.out.println("Store is closed!");
                System.out.printf("%d eggs sold.%n", eggsSold);
                break;
            }
            int count = Integer.parseInt(scanner.nextLine());

            switch (command) {
                case "Buy":
                    if (count > eggsLeft) {
                        isEnough = false;
                        break;
                    }
                    eggsLeft -= count;
                    eggsSold += count;
                    break;
                case "Fill":
                    eggsLeft += count;
                    break;
            }
        }
    }
}
