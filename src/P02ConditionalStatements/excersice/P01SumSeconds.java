package P02ConditionalStatements.excersice;

import java.util.Scanner;

public class P01SumSeconds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // чете времената на състезателите в секунди
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        // пресмята сумарното им време във формат "минути:секунди".
        int totalTime = first + second + third;

        int minutes = totalTime / 60;
        int seconds = totalTime % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }

    }


}
