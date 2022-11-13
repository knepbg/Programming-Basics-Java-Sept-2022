package P02ConditionalStatements.lab;

import java.util.Scanner;

public class P04PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // която чете парола (текст),
        String password = scanner.nextLine();

        // проверява дали въведената парола съвпада с фразата "s3cr3t!P@ssw0rd"
        String correctPassword = "s3cr3t!P@ssw0rd";

        // се изведе "Welcome". -> се изведе "Wrong password!".

        if (password.equals(correctPassword)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
