package P03ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class P09FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productName = scanner.nextLine();
        String product = "";

        switch (productName) {
            case "banana" :
            case "apple" :
            case "kiwi" :
            case "cherry" :
            case "lemon" :
            case "grapes" :
                product = "fruit";
                break;
            case "tomato" :
            case "cucumber" :
            case "pepper" :
            case "carrot" :
                product = "vegetable" ;
                break;
            default:
                product = "unknown";
        }

        System.out.println(product);


    }
}
