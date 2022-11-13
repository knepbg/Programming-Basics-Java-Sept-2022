package P01FirstStepsInCoding.moreExercises;

import java.util.Scanner;

public class P1TrapeziodArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // чете от конзолата три дробни числа b1, b2 и h
        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        // пресмята лицето на трапец. Формулата за лице на трапец е (b1 + b2) * h / 2.
        //Отговорът трябва да е форматиран до втората цифра след десетичния знак.

        double area = (b1 + b2) * h / 2;

        //printing
        System.out.printf("%.2f", area);


    }
}
