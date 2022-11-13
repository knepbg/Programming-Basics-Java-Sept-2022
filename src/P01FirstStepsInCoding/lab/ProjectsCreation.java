package P01FirstStepsInCoding.lab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {

        // четене от конзолата
        Scanner scanner = new Scanner(System.in);

        //входиране на данни :
        // 1.	Името на архитекта - текст
        // 2.	Брой на проектите, които трябва да изготви - цяло число в интервала [0 … 100]

        String name = scanner.nextLine();
        int projectsCount = Integer.parseInt(scanner.nextLine());

        // обработка на данните : изчислява колко часа ще са необходими
        // един проект отнема три часа.
        int coefficient = 3;
        int necessaryHours = projectsCount * coefficient;

        // печатане на резултата
        //"The architect {името на архитекта} will need
        // {необходими часове} hours to complete {брой на проектите} project/s."

        System.out.println(String.format("The architect %s will need " +
                "%d hours to complete %d project/s.", name, necessaryHours, projectsCount));

    }
}
