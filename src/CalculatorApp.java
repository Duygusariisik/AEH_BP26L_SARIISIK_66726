import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose operation:");
            System.out.println("1 - Add");
            System.out.println("2 - Subtract");
            System.out.println("3 - Multiply");
            System.out.println("4 - Divide");
            System.out.println("0 - Exit");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input!");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Bye!");
                break;
            }

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid option!");
                continue;
            }

            System.out.print("Enter first number: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid number!");
                scanner.next();
            }
            double a = scanner.nextDouble();

            System.out.print("Enter second number: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid number!");
                scanner.next();
            }
            double b = scanner.nextDouble();

            double result = 0;

            switch (choice) {
                case 1:
                    result = a + b;
                    break;
                case 2:
                    result = a - b;
                    break;
                case 3:
                    result = a * b;
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Cannot divide by zero!");
                        continue;
                    }
                    result = a / b;
                    break;
            }

            System.out.println("Result: " + result);
        }
    }
}