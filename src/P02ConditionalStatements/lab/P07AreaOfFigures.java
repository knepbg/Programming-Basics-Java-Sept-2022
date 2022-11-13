package P02ConditionalStatements.lab;

import java.util.Scanner;

public class P07AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // въвежда вида и размерите на геометрична фигура
        String kind = scanner.nextLine();
        double area = 0.0;
        // На първия ред на входа  квадрат (square), правоъгълник (rectangle), кръг (circle) и триъгълник (triangle)
        // пресмята лицето й

//        •	Ако фигурата е квадрат (square): на следващия ред се чете едно дробно число - дължина на страната му
//        •	Ако фигурата е правоъгълник (rectangle): на следващите два реда четат две дробни числа - дължините на страните му
//        •	Ако фигурата е кръг (circle): на следващия ред чете едно дробно число - радиусът на кръга
//        •	Ако фигурата е триъгълник (triangle): на следващите два реда четат две дробни числа - дължината на страната му и дължината на височината към нея
//          Резултатът да се закръгли до 3 цифри след десетичната запетая.
        if (kind.equals("square")) {
            double length = Double.parseDouble(scanner.nextLine());
            area = length * length;
        } else if (kind.equals("rectangle")) {
            double length1 = Double.parseDouble(scanner.nextLine());
            double length2 = Double.parseDouble(scanner.nextLine());
            area = length1 * length2;
        } else if (kind.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            area = Math.PI * radius * radius;
        } else if (kind.equals("triangle")) {
            double length = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            area = length * h / 2;
        }
        System.out.printf("%.3f", area);
    }
}
