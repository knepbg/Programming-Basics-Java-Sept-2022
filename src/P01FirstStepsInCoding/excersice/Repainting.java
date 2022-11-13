package P01FirstStepsInCoding.excersice;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // въвеждане на данните :
        /*
        1.	Необходимо количество найлон (в кв.м.) - цяло число в интервала [1... 100]
        2.	Необходимо количество боя (в литри) - цяло число в интервала [1…100]
        3.	Количество разредител (в литри) - цяло число в интервала [1…30]
        4.	Часовете, за които майсторите ще свършат работата - цяло число в интервала [1…9]
         */
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int workingTime = Integer.parseInt(scanner.nextLine());

        // обработване на данни :
        /*
        1. добави още 10% от количеството боя.
        2. 2 кв.м. найлон
        3. 0.40 лв. за торбички
        4. заплаща на майсторите за 1 час работа, е равна на 30% от сбора на всички разходи за материали.
        5. сумата на всички разходи
         */
        double totalPaint = (paint + (paint * 0.1)) * 14.50;
        double totalNylon = (nylon + 2) * 1.50;
        double bags = 0.4;
        double totalPriceThinner = thinner * 5.00;
        double workPrice = ((totalPaint + totalNylon + bags + totalPriceThinner) * 0.30) * workingTime;
        double totalPrice = totalPaint + totalNylon + bags + totalPriceThinner + workPrice;

        // printing price
        System.out.println(totalPrice);

    }
}
