package P01FirstStepsInCoding.lab;

import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {

        // четене от конзолата
        Scanner scanner = new Scanner(System.in);

        // въвеждане на име от конзолата.
        String name = scanner.nextLine();

        // обработка на данните
        String greetings = "Hello, ";
        String signs = "!";

        // отпечатване на резултата "Hello, <name>!",
        // System.out.println(greetings + name + signs);
        System.out.println(String.format("Hello, %s!", name));
    }
}
