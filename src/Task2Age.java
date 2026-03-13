import java.util.Scanner;
public class Task2Age {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age in years:");
        int age = scanner.nextInt();
        int seconds = age * 365 * 24 * 60;
        System.out.println("My age in seconds: " + seconds);
    }
}
