package P03ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	На първия ред е месецът – May, June, July, August, September или October
//        •	На втория ред е броят на нощувките – цяло число в интервала [0 ... 200]
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double discountForApartment = 0.9;

//        •	За студио, при повече от 7 нощувки през май и октомври : 5% намаление.
//        •	За студио, при повече от 14 нощувки през май и октомври : 30% намаление.
//        •	За студио, при повече от 14 нощувки през юни и септември: 20% намаление.
//        •	За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление.


        double priceStudio = 0.00;
        double priceApartment = 0.00;

        switch (month) {
            case "May":
            case "October":
                if (nights >= 7 && nights < 14) {
                    priceStudio = (50 * nights) * 0.95;
                    priceApartment = 65 * nights;
                } else if (nights >= 14) {
                    priceStudio = (50 * nights) * 0.7;
                    priceApartment = (65 * nights) * discountForApartment;
                } else {
                    priceStudio = (50 * nights);
                    priceApartment = 65 * nights;
                }
                break;
            case "June":
            case "September":
                if (nights <= 14) {
                    priceStudio = 75.20 * nights;
                    priceApartment = 68.70 * nights;
                } else {
                    priceStudio = (75.20 * nights) * 0.8;
                    priceApartment = (68.70 * nights) * discountForApartment;
                }
                break;
            case "July":
            case "August":
                if (nights <= 14) {
                    priceStudio = 76 * nights;
                    priceApartment = 77 * nights;
                } else {
                    priceStudio = 76 * nights;
                    priceApartment = (77 * nights) * discountForApartment;
                }
                break;
        }

//        •	На първия ред: "Apartment: {цена за целият престой} lv."
//        •	На втория ред: "Studio: {цена за целият престой} lv."
        System.out.printf("Apartment: %.2f lv.%n", priceApartment);
        System.out.printf("Studio: %.2f lv.", priceStudio);

    }
}
