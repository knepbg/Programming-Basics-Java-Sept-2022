package P04ForLoop.moreExercises;

import java.util.Scanner;

public class P02Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	На първия ред – периода, за който трябва да направите изчисления. Цяло число в интервала [1 ... 1000]
//        •	На следващите редове(равни на броят на дните) – броя пациенти, които пристигат за преглед за текущия ден. Цяло число в интервала [0…10 000]

        int counter = Integer.parseInt(scanner.nextLine());

        int reviewed = 0;
        int unreviewed = 0;
        int doctors = 7;

        for (int i = 1; i <= counter; i++) {
            boolean isTouredDay = i % 3 == 0;
            int patients = Integer.parseInt(scanner.nextLine());
            if (isTouredDay && unreviewed > reviewed) {
                doctors++;
            }

            if (patients <= doctors) {
                reviewed = reviewed + patients;
            } else {
                reviewed = reviewed + doctors;
                unreviewed = unreviewed + (patients - doctors);
            }
        }

        System.out.printf("Treated patients: %d.%n", reviewed);
        System.out.printf("Untreated patients: %d.", unreviewed);

    }
}
