package P04ForLoop.exercise;

import java.util.Scanner;

public class P07TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	На първия ред – броя на групите от катерачи – цяло число в интервала [1...1000]
//        •	За всяка една група на отделен ред – броя на хората в групата – цяло число в интервала [1...1000]

        int counter = Integer.parseInt(scanner.nextLine());
        int totalPpl = 0;
        int musallaCount = 0;
        int montBlancCount = 0;
        int kilimanjaroCount = 0;
        int k2Count = 0;
        int everestCount = 0;

        for (int i = 1; i <= counter; i++) {
            int pplCount = Integer.parseInt(scanner.nextLine());
            totalPpl = totalPpl + pplCount;
            if (pplCount <= 5) {
                musallaCount += pplCount;
            } else if (pplCount <= 12) {
                montBlancCount += pplCount;
            } else if (pplCount <= 25) {
                kilimanjaroCount += pplCount;
            } else if (pplCount <= 40) {
                k2Count += pplCount;
            } else {
                everestCount += pplCount;
            }
        }
        double musallaProcent = (musallaCount * 1.0 / totalPpl) * 100;
        double montBlancProcent = (montBlancCount * 1.0 / totalPpl) * 100;
        double kilimanjaroProcent = (kilimanjaroCount * 1.0 / totalPpl) * 100;
        double k2Procent = (k2Count * 1.0 / totalPpl) * 100;
        double everestProcent = (everestCount * 1.0 / totalPpl) * 100;

        System.out.printf("%.2f%%%n",musallaProcent);
        System.out.printf("%.2f%%%n",montBlancProcent);
        System.out.printf("%.2f%%%n",kilimanjaroProcent);
        System.out.printf("%.2f%%%n",k2Procent);
        System.out.printf("%.2f%%%n",everestProcent);
    }
}
