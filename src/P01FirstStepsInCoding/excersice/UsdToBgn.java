package P01FirstStepsInCoding.excersice;

import java.util.Scanner;

public class UsdToBgn {
    public static void main(String[] args) {

        // въвеждане на данни
        Scanner scanner = new Scanner(System.in);

        // Прочетете входните данни от конзолата (щатските долари)
        // константа 1 USD = 1.79549 BGN.
        double usd = Double.parseDouble(scanner.nextLine());
        double rate = 1.79549;

        // изчисления
        double bgn = usd * rate;

        // printing

        System.out.println(bgn);
    }
}
