package P01FirstStepsInCoding.lab;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        // четене от конзолата
        Scanner scanner = new Scanner(System.in);

        // въвежда две цели числа (страните на правоъгълника a и b)
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        //пресмята лицето на правоъгълник с тези страни
        int area = a * b;

        //Отпечатване на резултата
        System.out.println(area);

    }
}
