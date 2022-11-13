package ProgrammingBasicsOnlineExam18And19July2020;

import java.util.Scanner;

public class P05BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int scored = Integer.parseInt(scanner.nextLine());

        String bestPlayerName = "";
        int bestPlayerScored = Integer.MIN_VALUE;

        while (true) {
            if (bestPlayerScored < scored) {
                bestPlayerName = name;
                bestPlayerScored = scored;
            }
            if (scored >= 10) {
                break;
            }
            name = scanner.nextLine();
            if (name.equals("END")) {
                break;
            }
            scored = Integer.parseInt(scanner.nextLine());

        }
        System.out.printf("%s is the best player!%n", bestPlayerName);
        if (scored >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", bestPlayerScored);
        } else {
            System.out.printf("He has scored %d goals.", bestPlayerScored);
        }
    }
}
