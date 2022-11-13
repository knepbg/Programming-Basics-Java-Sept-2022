package P01FirstStepsInCoding.excersice;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//         входни данни :
//        1.	Дължина в см – цяло число в интервала [10 … 500]
//        2.	Широчина в см – цяло число в интервала [10 … 300]
//        3.	Височина в см – цяло число в интервала [10… 200]
//        4.	Процент  – реално число в интервала [0.000 … 100.000]
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

//        изчисления
//        1. да се намери обема на аквариума - дължина * ширина * височина
//        2. Да се извади от общия обем 100 %, реалния обем, след ориспадане на процента на заетия обем от аксесоарите
//        3. Да се изчисли от куб. сант. в литри вода

        int wholeVolume = length * width * height;
        double realVolume = wholeVolume - (percent / 100) * wholeVolume;
        double litres = realVolume / 1000;

//          printing
        System.out.println(litres);

    }
}
