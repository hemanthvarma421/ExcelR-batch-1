import java.util.Scanner;

public class NextMultipleOf100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = getValidInteger(scanner);

        int nextMultiple = ((number / 100) + 1) * 100;

        System.out.println("The next multiple of 100 after " + number + " is: " + nextMultiple);

        scanner.close();
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