package P03ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class P08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Първият ред съдържа час на изпита – цяло число от 0 до 23.
//        •	Вторият ред съдържа минута на изпита – цяло число от 0 до 59.
//        •	Третият ред съдържа час на пристигане – цяло число от 0 до 23.
//        •	Четвъртият ред съдържа минута на пристигане – цяло число от 0 до 59.
        int hourOfExam = Integer.parseInt(scanner.nextLine());
        int minOfExam = Integer.parseInt(scanner.nextLine());
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        String status = "";
        int h = 0;
        int min = 0;

//        13:15 = 13 * 60 + 00 = 780    -30     12:45 = 12 * 60 + 45 = 750;

        int exam = (hourOfExam * 60) + minOfExam;
        int arrived = (hour * 60) + minutes;

        // Ако е дошъл след часа на изпита, той е закъснял.
        if (exam - arrived < 0) {
            // закаснял
            status = "Late";
            System.out.printf("%s%n", status);
            int delay = arrived - exam;
            if (delay >= 60) {
//        •	"hh:mm hours after the start" за закъснение от 1 час или повече.
                h = delay / 60;
                min = delay % 60;
                if (min > 9) {
                    System.out.printf("%d:%d hours after the start%n", h, min);
                } else {
                    System.out.printf("%d:0%d hours after the start%n", h, min);
                }
            } else {
//        •	 "mm minutes after the start" за закъснение под час.
                min = delay;
                if (min > 9) {
                    System.out.printf("%d minutes after the start%n", min);
                } else {
                    System.out.printf("0%d minutes after the start%n", min);
                }
            }
        }

//        дошъл навреме, ако е пристигнал в часа на изпита или до половин час  преди това.
        if (exam - arrived >= 0 && exam - arrived <= 30) {
            // на време
            status = "On time";
            if (arrived == exam) {
                System.out.println("On time");
            } else {
                int early = exam - arrived;
                System.out.printf("on time %d minutes before the start", early);
            }
        }

        // Ако е пристигнал по-рано повече от 30 минути, той е подранил
        if (exam - arrived > 30) {
            // подранил
            status = "Early";
            System.out.printf("%s%n", status);
            int early = exam - arrived;
            if (early >= 60) {
//                •	"hh:mm hours before the start" за подраняване с 1 час или повече.
                h = early / 60;
                min = early % 60;
                if (min > 9) {
                    System.out.printf("%d:%d hours before the start%n", h, min);
                } else {
                    System.out.printf("%d:0%d hours before the start%n", h, min);
                }
            } else {
//                •	"mm minutes before the start" за идване по-рано с по-малко от час.
                min = early;
                if (min > 9) {
                    System.out.printf("%d minutes before the start%n", min);
                } else {
                    System.out.printf("0%d minutes before the start%n", min);
                }
            }

//        •	"Late", ако студентът пристига по-късно от часа на изпита.
//        •	"On time", ако студентът пристига точно в часа на изпита или до 30 минути по-рано.
//        •	"Early", ако студентът пристига повече от 30 минути преди часа на изпита.

//       Ако студентът пристига с поне минута разлика от часа на изпита, отпечатайте на следващия ред:
//        •	"mm minutes before the start" за идване по-рано с по-малко от час.
//        •	"hh:mm hours before the start" за подраняване с 1 час или повече. Минутите винаги печатайте с 2 цифри, например 1:05.
//        •	 "mm minutes after the start" за закъснение под час.
//        •	"hh:mm hours after the start" за закъснение от 1 час или повече. Минутите винаги печатайте с 2 цифри, например 1:03.


        }
    }
}