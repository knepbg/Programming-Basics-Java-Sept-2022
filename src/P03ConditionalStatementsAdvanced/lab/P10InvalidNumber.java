package P03ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class P10InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // чете цяло число
        int num = Integer.parseInt(scanner.nextLine());

        // число е валидно, ако е в диапазона [100…200] или е 0.
        if (num >= 100 && num <= 200 || num == 0) {
        } else {
            System.out.println("invalid");
        }

    }
}
