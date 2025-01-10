import java.util.Scanner;

public class Demo19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int n = scanner.nextInt();

        int[] fibonacciSeries = getFibonacciSeries(n);

        if (fibonacciSeries != null) {
            for (int i = 0; i < fibonacciSeries.length; i++) {
                System.out.print(fibonacciSeries[i]);
                if (i < fibonacciSeries.length - 1) {
                    System.out.print(","); 
                }
            }
            System.out.println();
        }

        scanner.close();
    }

    
    public static int[] getFibonacciSeries(int n) {
        if (n <= 0) {
            System.out.println(0); 
            return null;
        }

        int[] fibonacci = new int[n];

        if (n >= 1) {
            fibonacci[0] = 0; 
        }
        if (n >= 2) {
            fibonacci[1] = 1; 
        }

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]; 
        }

        return fibonacci; 
    }
}
