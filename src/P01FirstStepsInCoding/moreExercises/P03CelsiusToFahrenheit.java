package P01FirstStepsInCoding.moreExercises;

import java.util.Scanner;

public class P03CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // чете градуси по скалата на Целзий (°C)
        double celsius = Double.parseDouble(scanner.nextLine());

        // преобразува до градуси по скалата на Фаренхайт (°F).
        double fahrenheit = (celsius * 1.8) + 32;

        // Форматирате изхода до втория знак след десетичната запетая.
        System.out.printf("%.2f", fahrenheit);
    }
}
