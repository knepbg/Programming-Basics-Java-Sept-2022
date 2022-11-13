package ProgrammingBasicsOnlineExam18And19July2020;

import java.util.Scanner;

public class P03AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        1.	Брой дограми – цяло число в интервала [0..1000];
//        2.	Вид на дограмите – текст "90X130" или "100X150" или "130X180" или "200X300";
//        3.	Начин на получаване – текст
//            •	С доставка - "With delivery"
//            •	Без доставка - "Without delivery"

        int count = Integer.parseInt(scanner.nextLine());
        String joineryType = scanner.nextLine();
        String receivingType = scanner.nextLine();

        if (count <= 10) {
            System.out.println("Invalid order");
        } else {
            double joineryPrice = 0.00;

            switch (joineryType) {
                case "90X130":
                    joineryPrice = 110;
                    if (count >= 30 && count < 60) {
                        joineryPrice *= 0.95;
                    } else if (count >= 60) {
                        joineryPrice *= 0.92;
                    }
                    break;
                case "100X150":
                    joineryPrice = 140;
                    if (count >= 40 && count < 80) {
                        joineryPrice *= 0.94;
                    } else if (count >= 80) {
                        joineryPrice *= 0.90;
                    }
                    break;
                case "130X180":
                    joineryPrice = 190;
                    if (count >= 20 && count < 50) {
                        joineryPrice *= 0.93;
                    } else if (count >= 50) {
                        joineryPrice *= 0.88;
                    }
                    break;
                case "200X300":
                    joineryPrice = 250;
                    if (count >= 25 && count < 50) {
                        joineryPrice *= 0.91;
                    } else if (count >= 50) {
                        joineryPrice *= 0.86;
                    }
                    break;
            }

            double totalPrice = joineryPrice * count;
            if (receivingType.equals("With delivery")) {
                totalPrice += 60;
            }
            if (count > 99) {
                totalPrice *= 0.96;
            }
            System.out.printf("%.2f BGN", totalPrice);
        }

    }
}
