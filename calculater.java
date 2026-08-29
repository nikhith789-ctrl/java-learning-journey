import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number: ");
            int a = sc.nextInt();
            System.out.println("Enter second number: ");
            int b = sc.nextInt();
            System.out.println("Enter operation (+, -, *, /, %): ");
            String operation = sc.next();
            if(operation.equals("+")) {
                System.out.println("Addition: " + (a + b));
            } else if(operation.equals("-")) {
                System.out.println("Subtraction: " + (a - b));
            } else if(operation.equals("*")) {
                System.out.println("Multiplication: " + (a * b));
            } else if(operation.equals("/")) {
                System.out.println("Division: " + (a / b));
            } else if(operation.equals("%")) {
                System.out.println("Modulus: " + (a % b));
            } else {
                System.out.println("Invalid operation.");
            }
        }
    }
}
    