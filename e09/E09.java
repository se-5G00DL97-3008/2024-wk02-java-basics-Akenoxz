import java.util.Scanner;

public class E09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int total = 0;

        while (true) {
            System.out.println("Give a test score (-1 to quit):");
            int score = scanner.nextInt();

            if (score == -1) {
                break;
            }

            total += score;
            count++;
            System.out.println("Average: " + ((double) total / count));
        }
    }
}
