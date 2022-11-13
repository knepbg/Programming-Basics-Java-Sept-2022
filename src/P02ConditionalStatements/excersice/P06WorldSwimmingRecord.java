package P02ConditionalStatements.excersice;

import java.util.Scanner;

public class P06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        1.	Рекордът в секунди – реално число в интервала [0.00 … 100000.00]
//        2.	Разстоянието в метри – реално число в интервала [0.00 … 100000.00]
//        3.	Времето в секунди, за което плува разстояние от 1 м. - реално число в интервала [0.00 … 1000.00]
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeFor1Minute = Double.parseDouble(scanner.nextLine());

//        съпротивлението на водата го забавя на всеки 15 м. с 12.5 секунди.
        double delay = Math.floor(distance / 15) * 12.5;

//        Да се изчисли времето в секунди, за което Иван ще преплува разстоянието и разликата спрямо Световния рекорд.
        double ivansTime = (distance * timeFor1Minute) + delay;

//            •	Ако Иван е подобрил Световния рекорд (времето му е по-малко от рекорда) отпечатваме:
//                    o	"Yes, he succeeded! The new world record is {времето на Иван} seconds."
//            •	Ако НЕ е подобрил рекорда (времето му е по-голямо или равно на рекорда) отпечатваме:
//                    o	"No, he failed! He was {недостигащите секунди} seconds slower."
        if (ivansTime >= record) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", ivansTime - record);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", ivansTime);
        }

    }
}
