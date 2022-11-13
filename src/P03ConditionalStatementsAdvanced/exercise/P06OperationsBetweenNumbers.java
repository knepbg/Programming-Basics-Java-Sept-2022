package P03ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // •	N1 – цяло число в интервала [0...40 000]
        // •	N2 – цяло число в интервала [0...40 000]
        // •	Оператор – един символ измеду: "+", "-", "*", "/", "%"
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String newChar = scanner.nextLine();

        double result = 0.00;

        switch (newChar) {
            case "+":
                result = n1 + n2;
                printEvenOrOdd(n1, newChar, n2, result);
                break;
            case "-":
                result = n1 - n2;
                printEvenOrOdd(n1, newChar, n2, result);
                break;
            case "*":
                result = n1 * n2;
                printEvenOrOdd(n1, newChar, n2, result);
                break;
            case "/":
                if (isDivideByZero(n2)) {
                    System.out.println(printErrorDivided(n2));
                } else {
                    result = n1 * 1.0 / n2;
                    System.out.printf("%d %s %d = %.2f", n1, newChar, n2, result);
                }
                break;
            case "%":
                if (isDivideByZero(n2)) {
                    System.out.println(printErrorDivided(n2));
                } else {
                    result = n1 % n2;
                    System.out.printf("%d %s %d = %.0f", n1, newChar, n2, result);
                }
                break;
        }
    }

    public static Boolean isEven(double result) {
        return result % 2 == 0;
    }

    public static Boolean isDivideByZero(int n2) {
        return n2 == 0;
    }

    public static void printEvenOrOdd(int n1, String newChar, int n2, double result) {
        if (isEven(result)) {
            System.out.println(String.format("%d %s %d = %.0f - even", n1, newChar, n2, result));
        } else {
            System.out.println(String.format("%d %s %d = %.0f - odd", n1, newChar, n2, result));
        }
    }

    public static String printErrorDivided(int n1) {
        return String.format("Cannot divide %d by zero", n1);
    }
}
