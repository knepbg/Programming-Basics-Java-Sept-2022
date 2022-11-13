package P01FirstStepsInCoding.moreExercises;

import java.util.Scanner;

public class P02TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // чете от конзолата страна и височина на триъгълник
        // Използвайте формулата за лице на триъгълник: area = a * h / 2
        // Форматирате изхода до втория знак
        double a = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double area = a * h / 2;

        System.out.printf("%.2f", area);
    }
}
