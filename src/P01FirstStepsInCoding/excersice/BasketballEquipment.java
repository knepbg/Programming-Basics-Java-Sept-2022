package P01FirstStepsInCoding.excersice;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//         входни данни : •	Годишната такса за тренировки по баскетбол – цяло число в интервала [0… 9999]
        int taxis = Integer.parseInt(scanner.nextLine());

//         изчисления :
//        •	Баскетболни кецове – цената им е 40% по-малка от таксата за една година : shoes = taxis - (0.4 * taxis)
//        •	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете : clothes = shoes - (0.2 * shoes)
//        •	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип : bolls = clothes / 4
//        •	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка : accessors = bolls / 5
        double shoes = taxis - (0.4 * taxis);
        double clothes = shoes - (0.2 * shoes);
        double bolls = clothes / 4;
        double accessors = bolls / 5;
        double totalTaxis = shoes + clothes + bolls + accessors + taxis;

//            printing

        System.out.println(totalTaxis);

    }
}
