package P01FirstStepsInCoding.moreExercises;

import java.util.Scanner;

public class P10WeatherForecast2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // която при въведени градуси (реално число)
        double degrees = Double.parseDouble(scanner.nextLine());

        // 5.00 - 11.9	Cold
        // 12.00 - 14.9	Cool
        // 15.00 - 20.00	Mild
        // 20.1 - 25.9	Warm
        // 26.00 - 35.00 Hot
        // различни от посочените в таблицата, да се отпечата "unknown".

        if (degrees < 5) {
            System.out.println("unknown");
        } else if (degrees <= 11.9) {
            System.out.println("Cold");
        } else if (degrees <= 14.9) {
            System.out.println("Cool");
        } else if (degrees <= 20.0) {
            System.out.println("Mild");
        } else if (degrees <= 25.9) {
            System.out.println("Warm");
        } else if (degrees <= 35.0) {
            System.out.println("Hot");
        } else {
            System.out.println("unknown");
        }

    }
}
