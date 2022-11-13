package P01FirstStepsInCoding.moreExercises;

import java.util.Scanner;

public class P05TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // От конзолата се четат 2 числа, по едно на ред: w (дължина в метри) и h (широчина в метри).
        double w = Double.parseDouble(scanner.nextLine()); // 15
        double h = Double.parseDouble(scanner.nextLine()); // 8.9

        // Едно работно място заема 70 на 120 cm
        // Коридорът е широк поне 100 cm
        // входната врата (която е с отвор 160 cm) се губи точно 1 работно място
        // а заради катедрата (която е с размер 160 на 120 cm) се губят точно 2 работни места.
        // колко места се събирам в ширина :
        // 1. преобразуване от м. в см.
        double hInCentimetres = h * 100;
        // 2. изчисление на чиста ширина : обща ширина без коридора
        double totalW = hInCentimetres - 100; // 790
        int descPurRow = (int) ((totalW - (totalW % 70)) / 70);

        // колко места се събирам в дължина :
        // 1. преобразуване от м. в см.
        double wInCentimetres = w * 100;
        // 2. изчисление на чиста дължина
        int descPurColumn = (int) ((wInCentimetres - (wInCentimetres % 120)) / 120);

        // Да се отпечата на конзолата едно цяло число: броят места в учебната зала.
        int totalWorkingSpace = (descPurColumn * descPurRow) - 3;

        System.out.println(totalWorkingSpace);


    }
}
