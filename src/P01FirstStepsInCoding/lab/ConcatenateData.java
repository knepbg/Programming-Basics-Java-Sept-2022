package P01FirstStepsInCoding.lab;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {

        // четене от конзолата
        Scanner scanner = new Scanner(System.in);

        //Въвеждане на данни : име, фамилия, възраст и град
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String city = scanner.nextLine();

        //печатане на следното съобщение:
        // "You are <firstName> <lastName>, a <age>-years old person from <town>."
        System.out.println(String
                .format("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, city));

    }
}
