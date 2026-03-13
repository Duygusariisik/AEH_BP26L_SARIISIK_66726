import java.sql.SQLOutput;
import java.util.Scanner;
public class mySecondApp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your name:");
        String forename = scanner.nextLine();
        System.out.println("please enter your surname:");
        String surname = scanner.nextLine();
        scanner.close();
        System.out.println("welcome " + forename + " " + surname);
    }
}