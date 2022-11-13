package P03ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class P05SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        продукт (низ), град (низ) и количество (десетично число)

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double coffee = 0.00;
        double water = 0.00;
        double beer = 0.00;
        double sweets = 0.00;
        double peanuts = 0.00;

        double price = 0.00;

        if (city.equals("Sofia")) {
            switch (product) {
                case "coffee":
                    price = 0.50 * quantity;
                    break;
                case "water":
                    price = 0.80 * quantity;
                    break;
                case "beer":
                    price = 1.20 * quantity;
                    break;
                case "sweets":
                    price = 1.45 * quantity;
                    break;
                case "peanuts":
                    price = 1.60 * quantity;
                    break;
            }
        } else if (city.equals("Plovdiv")) {
            switch (product) {
                case "coffee":
                    price = 0.40 * quantity;
                    break;
                case "water":
                    price = 0.70 * quantity;
                    break;
                case "beer":
                    price = 1.15 * quantity;
                    break;
                case "sweets":
                    price = 1.30 * quantity;
                    break;
                case "peanuts":
                    price = 1.50 * quantity;
                    break;
            }
        } else if (city.equals("Varna")) {
            switch (product) {
                case "coffee":
                    price = 0.45 * quantity;
                    break;
                case "water":
                    price = 0.70 * quantity;
                    break;
                case "beer":
                    price = 1.10 * quantity;
                    break;
                case "sweets":
                    price = 1.35 * quantity;
                    break;
                case "peanuts":
                    price = 1.55 * quantity;
                    break;
            }
        }
        System.out.printf("%.2f", price);
    }
}
