package P04ForLoop.lab;

import java.util.Scanner;

public class P02NumbersN1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = num; i > 0; i--) {
            System.out.println(i);
        }
    }
}
