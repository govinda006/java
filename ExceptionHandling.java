import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println("Square root of " + num + " is " + Math.sqrt(num));
        } catch (InputMismatchException e) {
            System.out.println("Input must be an integer.");
        } finally {
            scanner.close();
        }
    }
}

