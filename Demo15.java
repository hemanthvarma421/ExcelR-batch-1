import java.util.Scanner;

public class Demo15{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = getValidInteger(scanner);
        System.out.print("Enter the second number: ");
        int secondNumber = getValidInteger(scanner);
 
        System.out.println("Before swapping: ");
        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);

        swapUsingTempVariable(firstNumber, secondNumber);

        scanner.close();
    }

    public static void swapUsingTempVariable(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping using temporary variable: ");
        System.out.println("First Number: " + a);
        System.out.println("Second Number: " + b);
    }
    public static int getValidInteger(Scanner scanner) {
        int value;
        while (true) {
            try {
                value = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.print("Invalid input. Please enter an integer: ");
                scanner.next();
            }
        }
        return value;
    }
}