import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your height: ");
        double height = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean is_student = scanner.nextBoolean();

        System.out.print("Enter your grade: ");
        char grade = scanner.next().charAt(0);

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Is Student: " + is_student);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}