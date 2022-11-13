package ProgrammingBasicsOnlineExam22October2022;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	n - брой компютри - цяло число в интервала [1…10]
//        На следващите n реда:
//        •	Числото, представляващо възможните продажби и рейтинга - цяло число в интервала [32…306]

        int countComputers = Integer.parseInt(scanner.nextLine());
        int currentRating = 0;
        int rating = 0;
        int possibleSales = 0;
        double sales = 0;


        for (int i = 1; i <= countComputers; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            currentRating = num % 10;
            rating = rating + currentRating;
            possibleSales = (num / 10);
            switch (currentRating) {
                case 2:
                    sales = sales + (possibleSales * 0.00);

                    break;
                case 3:
                    sales = sales + (possibleSales * 0.5);
                    break;
                case 4:
                    sales = sales + (possibleSales * 0.7);
                    break;
                case 5:
                    sales = sales + (possibleSales * 0.85);
                    break;
                case 6:
                    sales = sales + (possibleSales * 1.0);
                    break;
            }
        }
        double avarigeRating = rating * 1.0 / countComputers;
        System.out.printf("%.2f%n",sales);
        System.out.printf("%.2f",avarigeRating);

    }
}
