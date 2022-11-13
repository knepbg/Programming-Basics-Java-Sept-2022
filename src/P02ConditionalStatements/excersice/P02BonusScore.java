package P02ConditionalStatements.excersice;

import java.util.Scanner;

public class P02BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Дадено е цяло число – начален брой точки.
        int points = Integer.parseInt(scanner.nextLine());
        double bonus = 0.00;
        double totalBonus = 0.00;
        int extraBonus = 0;

//           Върху него се начисляват бонус точки
//           пресмята бонус точките, които получава числото и общия брой точки
//        •	Ако числото е до 100 включително, бонус точките са 5.
//        •	Ако числото е по-голямо от 100, бонус точките са 20% от числото.
//        •	Ако числото е по-голямо от 1000, бонус точките са 10% от числото.
//        •	Допълнителни бонус точки (начисляват се отделно от предходните):
//                o	За четно число  + 1 т.
//                o	За число, което завършва на 5  + 2 т.
        if (points <= 100) {
            if (points % 2 == 0) {
                extraBonus = 1;
                bonus = 5 + extraBonus;
                totalBonus = points + bonus;
            } else if (points % 10 == 5) {
                extraBonus = 2;
                bonus = 5 + extraBonus;
                totalBonus = points + bonus;
            } else {
                bonus = 5 + extraBonus;
                totalBonus = points + bonus;
            }
        } else if (points > 1000) {
            if (points % 2 == 0) {
                extraBonus = 1;
                bonus = (points * 0.1) + extraBonus;
                totalBonus = points + bonus;
            } else if (points % 10 == 5) {
                extraBonus = 2;
                bonus = (points * 0.1) + extraBonus;
                totalBonus = points + bonus;
            } else {
                bonus = (points * 0.1) + extraBonus;
                totalBonus = points + bonus;
            }
        } else if (points > 100) {
            if (points % 2 == 0) {
                extraBonus = 1;
                bonus = (points * 0.2) + extraBonus;
                totalBonus = points + bonus;
            } else if (points % 10 == 5) {
                extraBonus = 2;
                bonus = (points * 0.2) + extraBonus;
                totalBonus = points + bonus;
            } else {
                bonus = (points * 0.2) + extraBonus;
                totalBonus = points + bonus;
            }
        }
        System.out.println(bonus);
        System.out.println(totalBonus);


    }
}
