import java.util.Scanner;

public class IntegerDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number (Num1): ");
            String inputNum1 = scanner.nextLine();
            int num1 = Integer.parseInt(inputNum1); 
            System.out.print("Enter the second number (Num2): ");
            String inputNum2 = scanner.nextLine();
            int num2 = Integer.parseInt(inputNum2);  

         
            int result = num1 / num2;  
            System.out.println("Result of " + num1 + " / " + num2 + " = " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();  
        }
    }
}