package ProgrammingBasicsOnlineExam18And19July2020;

import java.util.Scanner;

public class P06BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Две четирицифрени числа, които показват обхвата на баркодовете, които трябва да промените.
//        •	Първи ред – четирицифрено число – началото на обхвата. Цяло число в интервала [1000…9999]
//        •	Втори ред – четирицифрено число – края на обхвата. Цяло число в интервала [1000…9999]
        int from = Integer.parseInt(scanner.nextLine());
        int to = Integer.parseInt(scanner.nextLine());

        int firstStart = from / 1000;
        int secondStart = ((from / 100) % 10);
        int thirdStart = ((from / 10) % 10);
        int fourthStart = (from % 10);

        int firstEnd = (to / 1000);
        int secondEnd = ((to / 100) % 10);
        int thirdEnd = ((to / 10) % 10);
        int fourthEnd = (to % 10);

        int firstNum = 0;
        int secondNum = 0;
        int thirdNum = 0;
        int fourthNum = 0;
        String correctBarcode = "";
        String print = correctBarcode;

        for (int i = firstStart; i <= firstEnd; i++) {
            if (i % 2 != 0) {
                firstNum = i;
            } else {
                continue;
            }
            for (int j = secondStart; j <= secondEnd; j++) {
                if (j % 2 != 0) {
                    secondNum = j;
                } else {
                    continue;
                }
                for (int k = thirdStart; k <= thirdEnd; k++) {
                    if (k % 2 != 0) {
                        thirdNum = k;
                    } else {
                        continue;
                    }
                    for (int l = fourthStart; l <= fourthEnd; l++) {
                        if (l % 2 != 0) {
                            fourthNum = l;
                            correctBarcode = String.format("%d%d%d%d ", firstNum, secondNum, thirdNum, fourthNum);
                            print = print + correctBarcode;
                        }

                    }
                }
            }
        }
        System.out.println(print);
    }


}
