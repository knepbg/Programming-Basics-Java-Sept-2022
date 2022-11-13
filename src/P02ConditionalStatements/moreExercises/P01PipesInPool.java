package P02ConditionalStatements.moreExercises;

import java.util.Scanner;

public class P01PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Първият ред съдържа числото V – Обем на басейна в литри – цяло число в интервала [1…10000].
//        •	Вторият ред съдържа числото P1 – дебит на първата тръба за час – цяло число в интервала [1…5000].
//        •	Третият ред съдържа числото P2 – дебит на втората тръба за час– цяло число в интервала [1…5000].
//        •	Четвъртият ред съдържа числото H – часовете които работникът отсъства – реално число в интервала [1.0…24.00]
        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        // 1000
        //100
        //120
        //3

        // колко са напълнили  тръбите :
        double totalLitersP1 = p1 * h; // 100 * 3 = 300
        double totalLitersP2 = p2 * h; // 120 * 3 = 360

        // колко е запълнен басейна :
        double pullFilled = (totalLitersP1 + totalLitersP2); // 660
        double pullFilledInPercent = (pullFilled / v) * 100.0;

        double p1FilledInPercent = (totalLitersP1 / pullFilled) * 100;
        double p2FilledInPercent = (totalLitersP2 / pullFilled) * 100;


//        •	До колко се е запълнил басейна и коя тръба с колко процента е допринесла.
//        o	"The pool is {запълненост на басейна в проценти}% full. Pipe 1: {процент вода от първата тръба}%. Pipe 2: {процент вода от втората тръба}%."
//        Aко басейнът се е препълнил – с колко литра е прелял за даденото време.
//        o	"For {часовете, които тръбите са пълнили вода} hours the pool overflows with {литрите вода в повече} liters."
        if (v < pullFilled) {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, pullFilled - v);
        } else {
            String pull = String.format("%.2f", pullFilledInPercent) + "%";
            String p1InPercent = String.format("%.2f", p1FilledInPercent) + "%";
            String p2InPercent = String.format("%.2f", p2FilledInPercent) + "%";
            System.out.printf("The pool is %s full. Pipe 1: %s. Pipe 2: %s.", pull, p1InPercent, p2InPercent);
        }

    }
}
