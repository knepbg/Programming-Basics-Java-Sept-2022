package P03ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // чете тип прожекция (стринг),
        // брой редове
        // брой колони в залата (цели числа),

        String projects = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int colum = Integer.parseInt(scanner.nextLine());
        int seats = colum * row;

        double totalPrice = 0.00;

        // пресмятам броя места в залата ( колони * редове )
        // switch за типа на прожекцията и в case пресмятане на общата цена
//        •	Premiere – премиерна прожекция, на цена 12.00 лева.
//        •	Normal – стандартна прожекция, на цена 7.50 лева.
//        •	Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.

        switch (projects) {
            case "Premiere":
                totalPrice = seats * 12.00;
                break;
            case "Normal":
                totalPrice = seats * 7.50;
                break;
            case "Discount":
                totalPrice = seats * 5.00;
                break;
        }

        System.out.println(String.format("%.2f", totalPrice));
    }
}
