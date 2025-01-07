import java.util.Scanner;

public class Demo14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an integer: ");
        int number = getValidInteger(scanner);

        
        System.out.println("Original number: " + number);
        System.out.println("Unary plus: " + (+number)); 
        System.out.println("Unary minus: " + (-number));

       
        System.out.println("Pre-increment: " + (++number)); 
        System.out.println("Post-increment: " + (number++)); 
        System.out.println("Value after post-increment: " + number); 

        
        number = getValidInteger(scanner); 
        System.out.println("Pre-decrement: " + (--number));
        System.out.println("Post-decrement: " + (number--)); 
        System.out.println("Value after post-decrement: " + number); 

       
        System.out.print("Enter a boolean value (true/false): ");
        boolean boolValue = getValidBoolean(scanner);
        System.out.println("Original boolean value: " + boolValue);
        System.out.println("Logical negation: " + (!boolValue));
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

  
    public static boolean getValidBoolean(Scanner scanner) {
        boolean value;
        while (true) {
            try {
                value = scanner.nextBoolean();
                break;
            } catch (Exception e) {
                System.out.print("Invalid input. Please enter true or false: ");
                scanner.next(); 
            }
        }
        return value;
    }
}