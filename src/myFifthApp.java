import java.util.Scanner;

public class myFifthApp {

    // Method to print the pattern
    public static void printPattern(char ch, int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(ch);
            }
            System.out.println(); // move to next line
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        System.out.print("Enter number of characters per line: ");
        int width = scanner.nextInt();

        System.out.print("Enter number of lines: ");
        int height = scanner.nextInt();

        printPattern(ch, width, height);

        scanner.close();
    }
}