import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        scanner.close();

        int largest;

        if (num1 >= num2 && num1 >= num3)
            largest = num1;
        else if (num2 >= num1 && num2 >= num3)
            largest = num2;
        else 
            largest = num3;

        System.out.println("Largest number is " + largest);
    }
}
