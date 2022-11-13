package P04ForLoop.lab;

import java.util.Scanner;

public class P04EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // чете число n
        int n = Integer.parseInt(scanner.nextLine());

        int mul = 1;

        for (int i = 0; i <= n ; i = i + 2) {

            System.out.println(mul);
            mul = mul * 2 * 2;

        }

    }
}
