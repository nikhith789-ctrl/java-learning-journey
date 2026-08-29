
// Day 2: Java Basics of arthmetic operations and conditional statements
public class day2 {
    public static void main(String[] args) {
        int a = 20;
        int b = 6;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        // Conditional Statements

        int num = 7;
        if (num > 10) {
            System.out.println("number is greater than 10");
        } else {
            System.out.println("number is not greater than 10");
        }
// Check if a number is even or odd
        int evenOddNum = 17;
        if (evenOddNum % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
// Checking grades based on marks
        int marks = 75;
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

    // learning about AND (&&) logical operators in Java
        int age = 65;
        if (age >= 18 && age < 60) {
            System.out.println("You are eligible.");
        } else {
            System.out.println("You are not eligible.");
        }

    // learning about OR (||) logical operators in Java
        int day = 3;
        if (day == 1 || day == 2) {
            System.out.println("first two days.");
        } else {
            System.out.println("other days.");
        }
    }
}