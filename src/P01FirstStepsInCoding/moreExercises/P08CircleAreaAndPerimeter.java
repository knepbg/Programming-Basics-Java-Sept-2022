package P01FirstStepsInCoding.moreExercises;

import java.util.Scanner;

public class P08CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        чете от конзолата число r
        double r = Double.parseDouble(scanner.nextLine());

//        пресмята и отпечатва лицето и периметъра на кръг
        double area = Math.PI * (r * r);
        double round = 2 * Math.PI * r;

        System.out.println(String.format("%.2f", area));
        System.out.println(String.format("%.2f", round));

    }
}
