package P03ConditionalStatementsAdvanced.moreExercises;

import java.util.Scanner;

public class P08PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //числа x1, y1, x2, y2, x и y
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        boolean isBorder = false;

        if (x1 == x || x2 == x) {
            if (y1 <= y && y <= y2) {
                isBorder = true;
            }
        } else if (y1 == y || y2 == y) {
            if (x1 <= x && x <= x2) {
                isBorder = true;
            }
        }

        if (isBorder) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
    }
}
