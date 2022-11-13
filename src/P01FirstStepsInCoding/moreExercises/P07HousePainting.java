package P01FirstStepsInCoding.moreExercises;

import java.util.Scanner;

public class P07HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        От конзолата се четат 3 реда:
//        1.	x – височината на къщата – реално число в интервала [2...100]
//        2.	y – дължината на страничната стена – реално число в интервала [2...100]
//        3.	h – височината на триъгълната стена на прокрива – реално число в интервала [2...100]

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double z = Double.parseDouble(scanner.nextLine());

        // пресмятане на предна стена ( квадрат със страна х )
        // 1.  пресмятане  на квадратурата на вратата ( размери 1.2 * 2 )
        // 2. обща квадратура (х * х ) - вратата
        double doorArea = 1.2 * 2;
        double frontWallArea = (x * x) - doorArea;

        // пресмятане на задна стена ( квадрат със страна х )
        double backWallArea = x * x;

        // пресмятане на лява стена с размери ( х * y )
        // 1. Квадратура на прозореца ( 1.5 * 1.5 )
        // 2. обща квадратур на стената ( x * y ) - прозореца
        double windowArea = 1.5 * 1.5;
        double leftWallArea = (x * y) - windowArea;

        // пресмятане на дясна стена с размери ( х * y )
        double rightWallArea = (x * y) - windowArea;

        // пресмятане на обща квадратура стени
        double wallArea = frontWallArea + backWallArea + leftWallArea + rightWallArea;

        // пресмятане на зелена боя Разхода на зелената боя е 1 литър за 3.4 м2,
        double greedPain = wallArea / 3.4;

        System.out.println(String.format("%.2f", greedPain));

        // изчисление на покрива ( 2 правоъгълника ( х * у ) и 2 триъгалника ( х * z/2 ) )
        double totalRoofArea = (2 * (x * y) + 2 * (x * z / 2));

        // червена боя е 1 литър за 4.3 м2,
        double radPain = totalRoofArea / 4.3;

        System.out.println(String.format("%.2f", radPain));

    }
}
