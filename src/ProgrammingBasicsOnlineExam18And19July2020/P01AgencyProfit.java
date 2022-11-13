package ProgrammingBasicsOnlineExam18And19July2020;

import java.util.Scanner;

public class P01AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // детският билет е със 70% по-евтин.
        // всеки билет такса обслужване
        // Крайната печалба на Агенцията е 20% от общата цена на всички билети.

//
//        1. Име на авиокомпанията - текст
//        2. Брой билети за възрастни – цяло число в диапазона [1...400]
//        3. Брой детски билети – цяло число в диапазона [25...120]
//        4. Нетна цена на билет за възрастен – реално число в диапазона [100.0...1600.0]
//        5. Цената на такса обслужване - реално число в диапазона [10.0...50.0]
        String companyName = scanner.nextLine();
        int adultTickets = Integer.parseInt(scanner.nextLine());
        int childTickets = Integer.parseInt(scanner.nextLine());
        double adultsPrice = Double.parseDouble(scanner.nextLine());
        double servicePrice = Double.parseDouble(scanner.nextLine());

        double childPrice = adultsPrice * 0.3;

        double totalForAdults = adultTickets * adultsPrice + adultTickets * servicePrice;
        double totalChild = childTickets * childPrice + childTickets * servicePrice;

        double totalProfit = (totalChild + totalForAdults) * 0.2;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",companyName, totalProfit);
    }
}
