package P01FirstStepsInCoding.excersice;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // въвеждане на данни - ъгъл в радиани (десетично число)
        double radians = Double.parseDouble(scanner.nextLine());

        // преозбразуване в градуси, формулата: градус = радиан * 180 / π.
        double degrees = radians * 180 / Math.PI;

        // printing
        System.out.println(degrees);

    }
}
