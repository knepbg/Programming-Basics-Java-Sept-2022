package P02ConditionalStatements.lab;

import java.util.Scanner;

public class P01ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // която чете оценка (цяло число)
        int great = Integer.parseInt(scanner.nextLine());

        // и отпечатва "Excellent!" ако оценката е 5 или по-висока.

        if (great >= 5) {
            System.out.println("Excellent!");
        }
    }
}
