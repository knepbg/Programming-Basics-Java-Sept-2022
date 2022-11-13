package P02ConditionalStatements.excersice;

import java.util.Scanner;

public class P05GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Ред 1.	Бюджет за филма – реално число в интервала [1.00 … 1000000.00]
//        Ред 2.	Брой на статистите – цяло число в интервала [1 … 500]
//        Ред 3.	Цена за облекло на един статист – реално число в интервала [1.00 … 1000.00]

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double cloth = Double.parseDouble(scanner.nextLine());
        double clothPrice = cloth * statists;

        // •	Декорът за филма е на стойност 10% от бюджета.
        double decor = budget * 0.1;

        // •	При повече от 150 статиста,  има отстъпка за облеклото на стойност 10%.
        if (statists > 150) {
            clothPrice = clothPrice * 0.9;
        }

        double totalFilmCost = decor + clothPrice;

//        •	Ако  парите за декора и дрехите са повече от бюджета:
//                o	"Not enough money!"
//                o	"Wingard needs {парите недостигащи за филма} leva more."
//        •	Ако парите за декора и дрехите са по малко или равни на бюджета:
//                o	"Action!"
//                o	"Wingard starts filming with {останалите пари} leva left."

        if (totalFilmCost <= budget) {
            System.out.println(String.format("Action!"));
            System.out.println(String.format("Wingard starts filming with %.2f leva left.", budget - totalFilmCost));
        } else {
            System.out.println(String.format("Not enough money!"));
            System.out.println(String.format("Wingard needs %.2f leva more.", totalFilmCost - budget));
        }

    }
}
