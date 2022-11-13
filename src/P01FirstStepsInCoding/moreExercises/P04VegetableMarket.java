package P01FirstStepsInCoding.moreExercises;

import java.util.Scanner;

public class P04VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Първи ред – Цена за килограм зеленчуци – реално число[0.00… 1000.00]
//        •	Втори ред – Цена за килограм плодове – реално число[0.00… 1000.00]
//        •	Трети ред – Общо килограми на зеленчуците – цяло число[0… 1000]
//        •	Четвърти ред – Общо килограми на плодовете – цяло число[0… 1000]
        // зеленчуци за N лева на килограм
        // плодове за M лева за килограм
        // че едно евро е равно на 1.94лв
        double n = Double.parseDouble(scanner.nextLine());
        double m = Double.parseDouble(scanner.nextLine());
        int vegetablesKilograms = Integer.parseInt(scanner.nextLine());
        int fruitsKilograms = Integer.parseInt(scanner.nextLine());

        double totalCostForVegetables = vegetablesKilograms * n;
        double totalCostForFruits = fruitsKilograms * m;
        double totalCost = (totalCostForFruits + totalCostForVegetables) / 1.94;

        System.out.printf("%.2f", totalCost);

    }
}
