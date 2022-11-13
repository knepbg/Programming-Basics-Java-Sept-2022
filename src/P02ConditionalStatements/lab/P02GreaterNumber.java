package P02ConditionalStatements.lab;

import java.util.Scanner;

public class P02GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // която чете две цели числа
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        // по-голямото от двете.
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
