import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which multiplication table to show?");
        int table = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " x " + table + " = " + (i * table));
        }
    }
}
