package P04ForLoop.moreExercises;

import java.util.Scanner;

public class P11OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = Integer.parseInt(scanner.nextLine());

        double oddMin = 1000000000.0;
        double oddMax = -1000000000.0;
        double oddSum = 0;

        double evenSum = 0;
        double evenMin = 1000000000.0;
        double evenMax = -1000000000.0;

        for (int i = 1; i <= counter; i++) {
            double num = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {
                evenSum += num;

                if (num < evenMin) {
                    evenMin = num;
                }
                if (num > evenMax) {
                    evenMax = num;
                }
            } else {
                oddSum += num;

                if (num < oddMin) {
                    oddMin = num;
                }
                if (num > oddMax) {
                    oddMax = num;
                }
            }
        }


        if (counter == 1) {
            System.out.printf("OddSum=%.2f,%n", oddSum);
            System.out.printf("OddMin=%.2f,%n", oddMin);
            System.out.printf("OddMax=%.2f,%n", oddMax);
            System.out.printf("EvenSum=%.2f,%n", evenSum);
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else if (counter == 0) {
            System.out.printf("OddSum=%.2f,%n", oddSum);
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
            System.out.printf("EvenSum=%.2f,%n", evenSum);
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("OddSum=%.2f,%n", oddSum);
            System.out.printf("OddMin=%.2f,%n", oddMin);
            System.out.printf("OddMax=%.2f,%n", oddMax);
            System.out.printf("EvenSum=%.2f,%n", evenSum);
            System.out.printf("EvenMin=%.2f,%n", evenMin);
            System.out.printf("EvenMax=%.2f%n", evenMax);
        }
    }
}
