import java.util.Scanner;

public class Demo17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = getValidNumber(scanner);

        System.out.print("Enter the second number: ");
        double secondNumber = getValidNumber(scanner);

        double sum = firstNumber + secondNumber;

        System.out.printf("The sum of %.2f and %.2f is: %.2f%n", firstNumber, secondNumber, sum);

        scanner.close();
    }

    public static double getValidNumber(Scanner scanner) {
        double value;
        while (true) {
            try {
                value = scanner.nextDouble();
                break;
            } catch (Exception e) {
                System.out.print("Invalid input. Please enter a numeric value: ");
                scanner.next();
            }
        }
        return value;
    }
}