package ProgrammingBasicsOnlineExam20And21April2019;

import java.util.Scanner;

public class P06EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int winnerPoints = 0;
        String winnerName = "";

        for (int i = 1; i <= count; i++) {
            String name = scanner.nextLine();
            String points = scanner.nextLine();
            int midPoints = 0;
            while (!points.equals("Stop")) {
                int i1 = Integer.parseInt(points);
                midPoints += i1;
                points = scanner.nextLine();
            }
            if (midPoints > winnerPoints) {
                winnerPoints = midPoints;
                winnerName = name;
                System.out.printf("%s has %d points.%n", winnerName, winnerPoints);
                System.out.printf("%s is the new number 1!%n", winnerName);
            } else {
                System.out.printf("%s has %d points.%n", name, midPoints);
            }

        }
        System.out.printf("%s won competition with %d points!", winnerName, winnerPoints);
    }
}
