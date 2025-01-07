import java.util.Scanner;

public class demo13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        double base = getPositiveDouble(scanner);

        System.out.print("Enter the height of the triangle: ");
        double height = getPositiveDouble(scanner);

        double area = calculateAreaOfTriangle(base, height);
        System.out.printf("The area of the triangle with base %.2f and height %.2f is: %.2f%n", base, height, area);

        scanner.close();
    }

    public static double calculateAreaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public static double getPositiveDouble(Scanner scanner) {
        double value;
        while (true) {
            try {
                value = scanner.nextDouble();
                if (value < 0) {
                    System.out.print("Value cannot be negative. Please enter a valid positive value: ");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.print("Invalid input. Please enter a numeric value: ");
                scanner.next(); // Clear the invalid input
            }
        }
        return value;
    }
}