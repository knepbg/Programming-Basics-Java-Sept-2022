package ProgrammingBasicsOnlineExam20And21April2019;

import java.util.Scanner;

public class P05EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // •	 Броят на козунаците – цяло число в интервала [1 ... 100]
        int count = Integer.parseInt(scanner.nextLine());

        // 1 paket zahar e 950 gr.
        // 1 paket brashno e 750 grama.

        int totalSugarUsed = 0;
        int totalFlourUsed = 0;

        int maxSugar = Integer.MIN_VALUE;
        int maxFlour = Integer.MIN_VALUE;

        for (int i = 1; i <= count; i++) {
            int sugar = Integer.parseInt(scanner.nextLine());
            int flour = Integer.parseInt(scanner.nextLine());
            totalSugarUsed += sugar;
            totalFlourUsed += flour;
            if (sugar > maxSugar) {
                maxSugar = sugar;
            }
            if (flour > maxFlour) {
                maxFlour = flour;
            }
        }

        double totalFlourInPacked = Math.ceil(totalFlourUsed * 1.0 / 750);
        double totalSugarInPacked = Math.ceil(totalSugarUsed * 1.0 / 950);

        System.out.printf("Sugar: %.0f%n", totalSugarInPacked);
        System.out.printf("Flour: %.0f%n", totalFlourInPacked);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);

    }
}
