package P04ForLoop.exercise;

import java.util.Scanner;

public class P06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Име на актьора - текст
//        •	Точки от академията - реално число в интервала [2.0... 450.5]
//        •	Брой оценяващи n - цяло число в интервала[1… 20]

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int counter = Integer.parseInt(scanner.nextLine());

        double points = academyPoints;

        for (int i = 1; i <= counter; i++) {
            if (points >= 1250.5) {
                break;
            }
            String juryName = scanner.nextLine();
            double juryPoints = Double.parseDouble(scanner.nextLine());
            int nameLength = juryName.length();

            points = points + ((nameLength * juryPoints) / 2);
        }

        if (points < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - points);
        } else {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, points);
        }

    }
}
