import java.util.Scanner;

public class Demo012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        try {
            double radius = scanner.nextDouble();

            if (radius < 0) {
                System.out.println("Radius cannot be negative. Please enter a valid radius.");
            } else {
                double area = calculateAreaOfCircle(radius);
                System.out.printf("The area of the circle with radius %.2f is: %.2f%n", radius, area);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a numeric value for the radius.");
        } finally {
            scanner.close();
        }
    }

    public static double calculateAreaOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}