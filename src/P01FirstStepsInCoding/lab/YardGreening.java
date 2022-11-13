package P01FirstStepsInCoding.lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {

        // четене от конзолата
        Scanner scanner = new Scanner(System.in);

        // въвеждане на данни : Кв. метри, които ще бъдат озеленени – реално число в интервала [0.00 … 10000.00]
        double area = Double.parseDouble(scanner.nextLine());

        //константа :
        // 1. Цената на един кв. м. е 7.61 лв със ДДС
        // 2. 18% отстъпка от крайната цена.
        double pricePerArea = 7.61;
        double discount = 0.18;

        // обработка на данните
        double price = area * pricePerArea;
        double discountCalculation = price * discount;
        double totalPrice = price - discountCalculation;

        // отпечатване на резултата :
        // 1. "The final price is: {крайна цена на услугата} lv."
        // 2. "The discount is: {отстъпка} lv."

        System.out.println(String.format("The final price is: %f lv.", totalPrice));
        System.out.println(String.format("The discount is: %f lv.", discountCalculation));

    }
}
