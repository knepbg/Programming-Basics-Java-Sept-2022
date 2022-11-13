package P04ForLoop.moreExercises;

import java.util.Scanner;

public class P01BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Наследените пари – реално число в интервала [1.00 ... 1 000 000.00]
//        •	Годината, до която трябва да живее (включително) – цяло число в интервала [1801 ... 1900]
        double budged = Double.parseDouble(scanner.nextLine());
        int yearWantToLive = Integer.parseInt(scanner.nextLine());
        int currentYear = 1800;
        int counter = yearWantToLive - currentYear;
        int age = 18;

        for (int i = currentYear; i <= yearWantToLive; i++) {
            if (i % 2 == 0) {
                budged -= 12000;
            } else {
                budged = budged - (12000 + (50 * age));
            }
            age++;
        }
        if (budged < 0) {
            double abs = Math.abs(budged);
            System.out.printf("He will need %.2f dollars to survive.", abs);
        } else {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", budged);
        }

    }
}
