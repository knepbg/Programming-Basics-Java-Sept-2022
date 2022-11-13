package P01FirstStepsInCoding.excersice;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // данни за прочитане:
        // 1. Брой страници в текущата книга – цяло число в интервала [1…1000] - 212
        // 2. Страници, които прочита за 1 час – цяло число в интервала [1…1000] - 20
        // 3. Броят на дните, за които трябва да прочете книгата – цяло число в интервала [1…1000] - 2
        int bookPages = Integer.parseInt(scanner.nextLine());
        int pagesReadForHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        // обработка на данните : броят часове, които Жоро трябва да отделя за четене всеки ден.
        // трябва да се намери за колко часа се прочита книгата ( bookPages / pagesReadForHour )
        // получените часеве трябва да се разпределят м/у въведените дни ( bookPages / pagesReadForHour ) / days
        int hoursForReadTheBook = bookPages / pagesReadForHour;
        int hoursForReadEveryDay = hoursForReadTheBook / days;

        // printing the result
        System.out.println(hoursForReadEveryDay);

    }
}
