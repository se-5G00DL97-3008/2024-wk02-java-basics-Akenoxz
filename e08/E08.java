import java.util.Scanner;

public class E08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter a number (0 to quit):");
            number = scanner.nextInt();

            if (number != 0) {
                System.out.println((number % 2 == 0) ? "Even number" : "Odd number");
            }
        } while (number != 0);
    }
}
