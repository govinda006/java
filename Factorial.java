import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
            scanner.close();

            int factorial = 1;
            for(int i = 1; i <= num; i++){
            factorial *= i;
            }

            System.out.println("Factorial of " + num + " is " + factorial);
        }
    }
}
