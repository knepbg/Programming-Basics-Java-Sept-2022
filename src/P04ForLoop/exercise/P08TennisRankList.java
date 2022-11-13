package P04ForLoop.exercise;

import java.util.Scanner;

public class P08TennisRankList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Брой турнири, в които е участвал – цяло число в интервала [1…20]
//        •	Начален брой точки в ранглистата - цяло число в интервала [1...4000]

        int countTournament = Integer.parseInt(scanner.nextLine());
        int statingPoints = Integer.parseInt(scanner.nextLine());
        int finalPoints = statingPoints;
        int winCounter = 0;

        for (int i = 1; i <= countTournament; i++) {
            String position = scanner.nextLine();

            switch (position) {
                case "W":
                    finalPoints += 2000;
                    winCounter++;
                    break;
                case "F":
                    finalPoints += 1200;
                    break;
                case "SF":
                    finalPoints += 720;
                    break;
            }
        }

        double pointsAverage = Math.floor((finalPoints - statingPoints) * 1.0 / countTournament);
        double percentWin = winCounter * 1.0 / countTournament * 100;

//        •	"Final points: {брой точки след изиграните турнири}"
//        •	"Average points: {средно колко точки печели за турнир}"
//        •	"{процент спечелени турнири}%"
        System.out.printf("Final points: %d%n", finalPoints);
        System.out.printf("Average points: %.0f%n", pointsAverage);
        System.out.printf("%.2f%%", percentWin);

    }
}
