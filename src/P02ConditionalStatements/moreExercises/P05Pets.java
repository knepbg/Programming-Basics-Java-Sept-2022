package P02ConditionalStatements.moreExercises;

import java.util.Scanner;

public class P05Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        •	Първи ред – брой дни – цяло число в интервал [1…5000]
//        •	Втори ред – оставена храна в килограми – цяло число в интервал [0…100000]
//        •	Трети ред – храна на ден за кучето в килограми – реално число в интервал [0.00…100.00]
//        •	Четвърти ред – храна на ден за котката в килограми– реално число в интервал [0.00…100.00]
//        •	Пети ред – храна на ден за костенурката в грамове – реално число в интервал [0.00…10000.00]
        int dayOff = Integer.parseInt(scanner.nextLine());
        int foodLeft = Integer.parseInt(scanner.nextLine());
        double dogFoodEat = Double.parseDouble(scanner.nextLine());
        double catFoodEat = Double.parseDouble(scanner.nextLine());
        double turtleFoodEat = (Double.parseDouble(scanner.nextLine())) / 1000;

        // food needed
        double dogFoodNeeded = dogFoodEat * dayOff;
        double catFoodNeeded = catFoodEat * dayOff;
        double turtleFoodNeeded = turtleFoodEat * dayOff;

        double totalFoodNeeded = dogFoodNeeded + catFoodNeeded + turtleFoodNeeded;

//        •	Ако оставената храна Е достатъчна:
//            o	"{килограма остатък} kilos of food left."
//        	Резултатът трябва да е закръглен към по-ниското цяло число
//        •	Ако оставената храна НЕ Е достатъчна:
//                o	“{килограма недостигат} more kilos of food are needed.”
        if (foodLeft >= totalFoodNeeded) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodLeft - totalFoodNeeded));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(totalFoodNeeded - foodLeft));
        }
    }
}
