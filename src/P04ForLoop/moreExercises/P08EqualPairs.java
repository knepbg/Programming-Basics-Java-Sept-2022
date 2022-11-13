package P04ForLoop.moreExercises;

import java.util.Scanner;

public class P08EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int difference = 0;
        int maxDifference = 0;


        for (int i = 1; i <= count; i++) {
            int firstNum = Integer.parseInt(scanner.nextLine());
            int secondNum = Integer.parseInt(scanner.nextLine());
            int middleSum = firstNum + secondNum;
            if (i == 1) {
                sum = middleSum;
                continue;
            } else {
                difference = Math.abs(sum - middleSum);
                sum = middleSum;
            }
            if (difference > maxDifference) {
                maxDifference = difference;
            }
        }
        if (maxDifference == 0) {
            System.out.printf("Yes, value=%d", sum);
        } else {
            System.out.printf("No, maxdiff=%d", maxDifference);
        }
    }
}
