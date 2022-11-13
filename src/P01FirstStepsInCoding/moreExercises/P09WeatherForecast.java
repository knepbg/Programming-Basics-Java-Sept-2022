package P01FirstStepsInCoding.moreExercises;

import java.util.Scanner;

public class P09WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // От конзолата се чете един ред – текст
        String weather = scanner.nextLine();

        String definedWord = "sunny";

        if (weather.equals(definedWord)) {
            System.out.println("It's warm outside!");
        } else {
            System.out.println("It's cold outside!");
        }

    }
}
