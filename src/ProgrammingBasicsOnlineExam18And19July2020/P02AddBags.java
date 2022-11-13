package ProgrammingBasicsOnlineExam18And19July2020;

import java.util.Scanner;

public class P02AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Цената на багаж над 20кг - реално число в диапазона [10.0...80.0]
//        2. Килограми на багажа – реално число в диапазона [1.0...32.0]
//        3. Дни до пътуването – цяло число в диапазона [1...60]
//        4. Брой багажи – цяло число в диапазона [1...10]

        double luggagePrice = Double.parseDouble(scanner.nextLine());
        double luggageWight = Double.parseDouble(scanner.nextLine());
        int daysLeft = Integer.parseInt(scanner.nextLine());
        int luggageCount = Integer.parseInt(scanner.nextLine());

//             до 10кг – 20% от цената на багаж над 20кг
//             между 10кг и 20кг вкл. – 50% от цената на багаж над 20кг.
//             над 20кг – таксата се чете от конзолата

        if (luggageWight < 10) {
            luggagePrice *= 0.2;
        } else if (luggageWight <= 20) {
            luggagePrice *= 0.5;
        }

        //        В зависимост от броя на дните, които остават до пътуването, цената се оскъпява:
//         повече от 30 дни - цената на багажа се оскъпява с 10%
//         между 7 и 30 дни вкл. - цената на багажа се оскъпява с 15%
//         по-малко от 7 дни - цената на багажа се оскъпява с 40%

        if (daysLeft < 7) {
            luggagePrice *= 1.4;
        } else if (daysLeft <= 30) {
            luggagePrice *= 1.15;
        } else {
            luggagePrice *= 1.1;
        }

        double totalAmount = luggageCount * luggagePrice;

        System.out.printf("The total price of bags is: %.2f lv.", totalAmount);


        // пресмята колко ще трябва да заплати Мими

    }

}
