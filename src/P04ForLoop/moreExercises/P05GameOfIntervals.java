package P04ForLoop.moreExercises;

import java.util.Scanner;

public class P05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        •	Първи ред - колко хода ще има по време на играта – цяло число в интервала [1...100]
//        •	За всеки ход – числата, които се проверяват в кой интервал са – цели числа в интервала [-100...100]
        int counter = Integer.parseInt(scanner.nextLine());
        int firstIntervalCount = 0;
        int secondIntervalCount = 0;
        int thirdIntervalCount = 0;
        int fourthIntervalCount = 0;
        int fifthIntervalCount = 0;
        int sixthIntervalCount = 0;
        double totalPoints = 0.00;

        for (int i = 1; i <= counter; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num >= 0 && num <= 9) {
                firstIntervalCount++;
                totalPoints = totalPoints + num * 0.2;
            } else if (num >= 10 && num <= 19) {
                secondIntervalCount++;
                totalPoints = totalPoints + num * 0.3;
            } else if (num >= 20 && num <= 29) {
                thirdIntervalCount++;
                totalPoints += num * 0.4;
            } else if (num >= 30 && num <= 39) {
                fourthIntervalCount++;
                totalPoints += 50;
            } else if (num >= 40 && num <= 50) {
                fifthIntervalCount++;
                totalPoints += 100;
            } else {
                sixthIntervalCount++;
                totalPoints /= 2;
            }
        }

        double firstIntervalPercent = firstIntervalCount * 1.0 / counter * 100;
        double secondIntervalPercent = secondIntervalCount * 1.0 / counter * 100;
        double thirdIntervalPercent = thirdIntervalCount * 1.0 / counter * 100;
        double fourthIntervalPercent = fourthIntervalCount * 1.0 / counter * 100;
        double fifthIntervalPercent = fifthIntervalCount * 1.0 / counter * 100;
        double sixthIntervalPercent = sixthIntervalCount * 1.0 / counter * 100;

        System.out.printf("%.2f%n", totalPoints);
        System.out.printf("From 0 to 9: %.2f%%%n", firstIntervalPercent);
        System.out.printf("From 10 to 19: %.2f%%%n", secondIntervalPercent);
        System.out.printf("From 20 to 29: %.2f%%%n", thirdIntervalPercent);
        System.out.printf("From 30 to 39: %.2f%%%n", fourthIntervalPercent);
        System.out.printf("From 40 to 50: %.2f%%%n", fifthIntervalPercent);
        System.out.printf("Invalid numbers: %.2f%%%n", sixthIntervalPercent);

    }
}
