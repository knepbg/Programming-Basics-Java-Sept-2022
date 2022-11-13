package P03ConditionalStatementsAdvanced.moreExercises;

import java.util.Scanner;

public class P03Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	На първия ред е броят на закупените хризантеми – цяло число в интервала [0 ... 200]
//        •	На втория ред е броят на закупените рози – цяло число в интервала [0 ... 200]
//        •	На третия ред е броят на закупените лалета – цяло число в интервала [0 ... 200]
//        •	На четвъртия ред е посочен сезона – [Spring, Summer, Autumn, Winter]
//        •	На петия ред е посочено дали денят е празник – [Y – да / N - не]

        double chrysanthemums = Double.parseDouble(scanner.nextLine());
        double roses = Double.parseDouble(scanner.nextLine());
        double tulip = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        boolean isHollyDay = "Y".equals(scanner.nextLine()); // увеличават с 15%.

        double totalPrice = 0.00;
        //        Цената за аранжиране на букета винаги е 2лв.
        int arrangement = 2;


        switch (season) {
            case "Spring":
            case "Summer":
                totalPrice = chrysanthemums * 2.00 + roses * 4.10 + tulip * 2.50;
                if (isHollyDay) {
                    totalPrice *= 1.15;
                }
                if (tulip > 7 && season.equals("Spring")) {
                    totalPrice *= 0.95;
                }
                break;
            case "Autumn":
            case "Winter":
                totalPrice = chrysanthemums * 3.75 + roses * 4.50 + tulip * 4.15;
                if (isHollyDay) {
                    totalPrice *= 1.15;
                }
                if (roses >= 10 && season.equals("Winter")) {
                    totalPrice *= 0.90;
                }
                break;
        }

        if (chrysanthemums + roses + tulip > 20) {
            totalPrice *= 0.8;
        }
        totalPrice += arrangement;
        System.out.printf("%.2f", totalPrice);


    }
}
