package P01FirstStepsInCoding.excersice;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // прочитане на входните данни :
        // 1. Депозирана сума – реално число в интервала [100.00 … 10000.00]
        // 2. Срок на депозита (в месеци) – цяло число в интервала [1…12]
        // 3. Годишен лихвен процент – реално число в интервала [0.00 …100.00]
        double depositValue = Double.parseDouble(scanner.nextLine());
        int periodInMonths = Integer.parseInt(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());

        // изчисления на данните за получаване на
        // сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        double finalAmount = depositValue + periodInMonths * ((depositValue * interest / 100) / 12);

        // printing results
        System.out.println(finalAmount);
    }
}
