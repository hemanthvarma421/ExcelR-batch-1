import java.util.Scanner;

public class Demo20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();

        // Call the getFizzBizz method and print the result
        String result = getFizzBizz(input);
        System.out.println(result);

        scanner.close();
    }

    // Method to return "FIZZ", "BIZZ", "FIZZBIZZ", or the number itself as a string
    public static String getFizzBizz(int number) {
        if (number <= 0) {
            return "Error"; // Return "Error" for negative or zero
        }
        if (number % 3 == 0 && number % 5 == 0) {
            return "FIZZBIZZ"; // Multiple of both 3 and 5
        } else if (number % 3 == 0) {
            return "FIZZ"; // Multiple of 3
        } else if (number % 5 == 0) {
            return "BIZZ"; // Multiple of 5
        } else {
            return String.valueOf(number); // Return the number itself as a string
        }
    }
}