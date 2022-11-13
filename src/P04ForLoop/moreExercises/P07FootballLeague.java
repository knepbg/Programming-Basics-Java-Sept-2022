package P04ForLoop.moreExercises;

import java.util.Scanner;

public class P07FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int countFens = Integer.parseInt(scanner.nextLine());

        int aCount = 0;
        int bCount = 0;
        int vCount = 0;
        int gCount = 0;

        for (int i = 1; i <= countFens; i++) {
            String sector = scanner.nextLine();

            switch (sector) {
                case "A":
                    aCount++;
                    break;
                case "B":
                    bCount++;
                    break;
                case "V":
                    vCount++;
                    break;
                case "G":
                    gCount++;
                    break;
            }
        }

        double aPercent = aCount * 1.0 / countFens * 100;
        double bPercent = bCount * 1.0 / countFens * 100;
        double vPercent = vCount * 1.0 / countFens * 100;
        double gPercent = gCount * 1.0 / countFens * 100;

        double fensPercent = countFens * 1.0 / capacity * 100;

        System.out.printf("%.2f%%%n", aPercent);
        System.out.printf("%.2f%%%n", bPercent);
        System.out.printf("%.2f%%%n", vPercent);
        System.out.printf("%.2f%%%n", gPercent);
        System.out.printf("%.2f%%%n", fensPercent);

    }
}
