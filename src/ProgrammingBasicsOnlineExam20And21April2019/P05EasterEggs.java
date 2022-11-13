package ProgrammingBasicsOnlineExam20And21April2019;

import java.util.Scanner;

public class P05EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
//        : "red", "orange", "blue", "green"
        int redCount = 0;
        int orangeCount = 0;
        int blueCount = 0;
        int greenCount = 0;
        String winColor = "";
        int max = 0;

        for (int i = 1; i <= count; i++) {
            String color = scanner.nextLine();

            switch (color) {
                case "red":
                    redCount++;
                    break;
                case "orange":
                    orangeCount++;
                    break;
                case "blue":
                    blueCount++;
                    break;
                case "green":
                    greenCount++;
                    break;
            }

        }
        if (redCount > orangeCount && redCount > blueCount && redCount > greenCount) {
            max = redCount;
            winColor = "red";
        } else if (orangeCount > redCount && orangeCount > blueCount && orangeCount > greenCount) {
            max = orangeCount;
            winColor = "orange";
        } else if (blueCount > redCount && blueCount > orangeCount && blueCount > greenCount) {
            max = blueCount;
            winColor = "blue";
        } else {
            max = greenCount;
            winColor = "green";
        }


        System.out.printf("Red eggs: %d%n", redCount);
        System.out.printf("Orange eggs: %d%n", orangeCount);
        System.out.printf("Blue eggs: %d%n", blueCount);
        System.out.printf("Green eggs: %d%n", greenCount);
        System.out.printf("Max eggs: %d -> %s", max, winColor);
    }
}
