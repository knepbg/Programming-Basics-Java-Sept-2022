package P01FirstStepsInCoding.excersice;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // данни за прочитане:
        /*      Брой пакети химикали - цяло число в интервала [0...100]
                Брой пакети маркери - цяло число в интервала [0...100]
                Литри препарат за почистване на дъска - цяло число в интервала [0…50]
                Процент намаление - цяло число в интервала [0...100]
         */
        int pensPackages = Integer.parseInt(scanner.nextLine());
        int markersPackages = Integer.parseInt(scanner.nextLine());
        int detergent = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        // обработка на данните :
        /*
        1. цена за химикалките = pensPackages * 5.80
        2. цена за маркерите = markersPackages * 7.20
        3. цена за препарата = detergent * 1.20
        4. Обща цена на покупките
        5. крайна цена, след отстъпката
         */
        double pensPrice = pensPackages * 5.8;
        double markersPrice = markersPackages * 7.2;
        double detergentPrice = detergent * 1.2;
        double totalPrice = pensPrice + markersPrice + detergentPrice;
        double finalPrice = totalPrice - (discount / 100.0) * totalPrice;

        // printing results
        System.out.println(finalPrice);
    }
}
