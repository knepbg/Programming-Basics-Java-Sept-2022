package P02ConditionalStatements.excersice;

import java.util.Scanner;

public class P08LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        1.	Име на сериал – текст
//        2.	Продължителност на епизод  – цяло число в диапазона [10… 90]
//        3.	Продължителност на почивката  – цяло число в диапазона [10… 120]

        String filmName = scanner.nextLine();
        int serialTime = Integer.parseInt(scanner.nextLine());
        int brakeTime = Integer.parseInt(scanner.nextLine());

//        Времето за обяд ще бъде 1/8 от времето за почивка, а времето за отдих ще бъде 1/4 от времето за почивка.

        double lunchTime = brakeTime / 8.0;
        double relaxTime = brakeTime / 4.0;
        double timeLeft = brakeTime - lunchTime - relaxTime;

        if (serialTime <= timeLeft) {
            double leftTime = Math.ceil(timeLeft - serialTime);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", filmName, leftTime);
        } else {
            double leftTime = Math.ceil(serialTime - timeLeft);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", filmName, leftTime);
        }

    }
}
