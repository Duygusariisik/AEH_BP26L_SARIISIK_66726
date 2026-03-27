import java.util.Scanner;

public class SquaresApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter lower and upper integer limits: ");

            int lower = scanner.nextInt();
            int upper = scanner.nextInt();

            if (upper <= lower) {
                System.out.println("Done");
                break;
            }

            int sum = 0;

            for (int i = lower; i <= upper; i++) {
                sum += i * i;
            }

            System.out.println("The sum of the squares is: " + sum);
        }
    }
}