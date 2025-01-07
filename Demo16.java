import java.util.Scanner;

public class Demo16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        
        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }

    
    public static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("[\\W]", "").toLowerCase(); 
        return cleanedStr.equals(new StringBuilder(cleanedStr).reverse().toString()); 
    }
}