package P01FirstStepsInCoding.lab;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {

        // четене от конзолата
        Scanner scanner = new Scanner(System.in);

        // въвеждане на реално число
        double inches = Double.parseDouble(scanner.nextLine());

        //преобразуване от инчове в сантиметри, като 1 инч = 2.54 сантиметра
        double coefficient = 2.54;
        double result = inches * coefficient;

        //Отпечатване на резултата
        System.out.println(result);
    }
}
