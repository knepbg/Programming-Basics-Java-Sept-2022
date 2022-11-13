package P04ForLoop.moreExercises;

import java.util.Scanner;

public class P04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	На първия ред – броя на студентите явили се на изпит – цяло число в интервала [1...1000]
//        •	За всеки един студент на отделен ред – оценката от изпита – реално число в интервала [2.00...6.00]

        int countStudent = Integer.parseInt(scanner.nextLine());
        int poorCount = 0;
        int goodCount = 0;
        int veryGoodCount = 0;
        int excellentCount = 0;

        double sumGreats = 0.00;

        for (int i = 1; i <= countStudent; i++) {
            double greats = Double.parseDouble(scanner.nextLine());
            sumGreats += greats;
            if (greats <= 2.99) {
                poorCount++;
            } else if (greats <= 3.99) {
                goodCount++;
            } else if (greats <= 4.99) {
                veryGoodCount++;
            } else {
                excellentCount++;
            }
        }
        double excellentPercent = excellentCount * 1.0 / countStudent * 100;
        double veryGoodPercent = veryGoodCount * 1.0 / countStudent * 100;
        double goodPercent = goodCount * 1.0 / countStudent * 100;
        double poorPercent = poorCount * 1.0 / countStudent * 100;
        double averageGreat = sumGreats / countStudent;

        System.out.printf("Top students: %.2f%%%n", excellentPercent);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", veryGoodPercent);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", goodPercent);
        System.out.printf("Fail: %.2f%%%n", poorPercent);
        System.out.printf("Average: %.2f", averageGreat);
    }
}
