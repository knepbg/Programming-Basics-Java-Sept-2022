package ProgrammingBasicsOnlineExam28And29March2020;

import java.util.Scanner;

public class P01BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Наем за залата – реално число в интервала [100.00..10000.00]
        double rent = Double.parseDouble(scanner.nextLine());


//        • Торта – цената ѝ е 20% от наема на залата
//        • Напитки – цената им е 45% по-малко от тази на тортата
//        • Аниматор – цената му е 1/3 от цената за наема на залата

        double cake = rent * 0.2;
        double drinks = cake - (cake * 0.45);
        double animator = rent / 3;

        double budget =  rent + cake + drinks + animator;

        System.out.printf("%.2f", budget);

    }
}
