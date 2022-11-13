package P04ForLoop.moreExercises;

public class P09Clock {
    public static void main(String[] args) {

        for (int hoers = 0; hoers <= 23; hoers++) {
            for (int minutes = 0; minutes <= 59; minutes++) {
                System.out.printf("%d : %d%n", hoers, minutes);
            }
        }
    }
}
