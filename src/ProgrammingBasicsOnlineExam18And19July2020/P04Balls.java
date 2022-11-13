package ProgrammingBasicsOnlineExam18And19July2020;

import java.util.Scanner;

public class P04Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        1.	От конзолата се чете 1 цяло число N, което е броят на топките в диапазон (0-1000).
//        2.	След това се четат N на брой цветове.
        int count = Integer.parseInt(scanner.nextLine());
        int points = 0;
        int countRed = 0;
        int countOrange = 0;
        int countYellow = 0;
        int countWhite = 0;
        int countDeviceByBlack = 0;
        int countUnknownColors = 0;

        for (int i = 1; i <= count; i++) {
            String color = scanner.nextLine();

            switch (color) {
                case "red":
                    points += 5;
                    countRed++;
                    break;
                case "orange":
                    points += 10;
                    countOrange++;
                    break;
                case "yellow":
                    points += 15;
                    countYellow++;
                    break;
                case "white":
                    points += 20;
                    countWhite++;
                    break;
                case "black":
                    points = points / 2;
                    countDeviceByBlack++;
                    break;
                default:
                    countUnknownColors++;
            }
        }

        System.out.printf("Total points: %d%n", points);
        System.out.printf("Red balls: %d%n", countRed);
        System.out.printf("Orange balls: %d%n", countOrange);
        System.out.printf("Yellow balls: %d%n", countYellow);
        System.out.printf("White balls: %d%n", countWhite);
        System.out.printf("Other colors picked: %d%n", countUnknownColors);
        System.out.printf("Divides from black balls: %d%n", countDeviceByBlack);

    }
}
