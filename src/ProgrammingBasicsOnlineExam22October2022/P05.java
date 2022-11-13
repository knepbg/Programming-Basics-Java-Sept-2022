package ProgrammingBasicsOnlineExam22October2022;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	"Yes" / "No" - текст - дали Атанас ще нощува преди изкачването на следващите метри или не
//        •	Изкачени метри - цяло число в интервала [1...4000]

        String command = scanner.nextLine();
        int days = 0;
        int currentKilometers = 5364;
        boolean isReached = true;

        while (!command.equals("END")) {
            if (command.equals("Yes")) {
                days++;

                if (days > 5) {
                    break;
                }
            }
            int dailyMeeters = Integer.parseInt(scanner.nextLine());
            days++;
            currentKilometers += dailyMeeters;

            if (currentKilometers >= 8848) {
                break;
            }

            command = scanner.nextLine();
        }

        if (currentKilometers >= 8848) {
            System.out.printf("Goal reached for %d days!", days);
        } else {
            System.out.println("Failed!");
            System.out.printf("%d", currentKilometers);
        }
    }
}
