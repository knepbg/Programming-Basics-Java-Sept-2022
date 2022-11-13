package P04ForLoop.lab;

import java.util.Scanner;

public class P03Numbers1NWithStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

//        отпечатва числата от 1 до n през 3

        for (int i = 1; i <= num; i = i + 3) {
            System.out.println(i);
        }
    }
}
