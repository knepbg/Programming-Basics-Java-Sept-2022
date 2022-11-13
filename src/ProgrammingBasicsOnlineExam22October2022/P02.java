package ProgrammingBasicsOnlineExam22October2022;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Първи ред – джобните на Тереза на ден – реално число в интервала [1.00 ...100.00]
//        •	Втори ред – парите, които тя печели на ден от продажби – реално число в интервала [1.00...1000.00]
//        •	Трети ред – разходите на Тереза за целия период – реално число в интервала [1.00...1000.00]
//        •	Четвърти ред – цената на подаръка – реално число в интервала [1.00...10000.00]

        double moneyPerDay = Double.parseDouble(scanner.nextLine());
        double profit = Double.parseDouble(scanner.nextLine());
        double allCost = Double.parseDouble(scanner.nextLine());
        double presentPrice = Double.parseDouble(scanner.nextLine());

        double savedMoney = moneyPerDay * 5;
        double allProfit = 5 * profit;
        double totalSavedMoney = savedMoney + allProfit;

        totalSavedMoney -= allCost;


        if ( totalSavedMoney >= presentPrice) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", totalSavedMoney);
        } else {
            double needed = presentPrice - totalSavedMoney;
            System.out.printf("Insufficient money: %.2f BGN.", needed);
        }

    }
}
