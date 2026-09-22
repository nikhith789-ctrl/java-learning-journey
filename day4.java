public class day4 {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
       
    }
}
////
public class day4 {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);
    }
}
////
public class day4 {
    public static void main(String[] args) {
        int[] numbers = {10,45,23,78,12,56};
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("Largest: " + largest);
    }
}
////
public class day4 {
    public static void main(String[] args) {
        int[] numbers = {10,45,23,78,12,56};
        int smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest: " + smallest);
    }
}
////
public class day4 {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 22, 31, 40, 55, 68};
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Total even numbers: " + count);
    }
}
////
public class day4 {
    public static void main(String[] args) {
        int[] numbers = {10, -5, 20, -8, 0, 15, -3};
        int positiveCount = 0;
        int negativeCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positiveCount++;
            } else if (numbers[i] < 0) {
                negativeCount++;
            }
        }
        System.out.println("Total positive numbers: " + positiveCount);
        System.out.println("Total negative numbers: " + negativeCount);
    }
}
////
public class day4 {
    public static void main(String[] args) {
      int[] numbers = {10, 20, 30, 40, 50};
      for (int i = numbers.length - 1; i >= 0; i--) {
          System.out.println(numbers[i]);
      }
    }    
}
////
import java.util.Scanner;
public class day4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Enter number:");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] == n) {
                System.out.println(n+"Number found at index "+i );
                return;
            }
        }
        System.out.println("Number not found");

    }
}
////
public class day4 {
    public static void main(String[] args) {
       int[] numbers = {10, 45, 23, 78, 12, 56};
        int largestIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[largestIndex]) {
                largestIndex = i;
            }
        }
        System.out.println("Largest number: " + numbers[largestIndex]);
        System.out.println("Index of largest number: " + largestIndex);
    }
}
////
public class day4 {
    public static void main(String[] args) {
       int[] numbers = {10, 45, 23, 78, 12, 56};
        int largestIndex = 0;
        int secondLargestIndex = -1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[largestIndex]) {
                secondLargestIndex = largestIndex;
                largestIndex = i;
            } else if (secondLargestIndex == -1 || numbers[i] > numbers[secondLargestIndex]) {
                secondLargestIndex = i;
            }
        }
        System.out.println("Largest number: " + numbers[largestIndex]);
        System.out.println("Index of largest number: " + largestIndex);
        System.out.println("Second largest number: " + numbers[secondLargestIndex]);
        System.out.println("Index of second largest number: " + secondLargestIndex);
    }
}
////
public class day4 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2; // Multiply each number by 2
            System.out.println(numbers[i]);
        }
    }
}
////
public class day4 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {    
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);
    }
}
////
import java.util.Scanner;
public class day4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to count:");
        int target = scanner.nextInt();
        int[] numbers = {10, 20, 10, 30, 10, 40, 20};
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                count++;
            }
        }
        System.out.println(target + " appears " + count + " times.");
    }
}
////
import java.util.Scanner;
public class day4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to count:");
        int target = scanner.nextInt();
        int[] numbers = {10, 20, 10, 30, 40, 20};
        for (int i = 0; i < numbers.length; i++) {
              boolean alreadyChecked = false;
            for (int j =0; j < i; j++) {
                if (numbers[j] == numbers[i]) {
                    alreadyChecked = true;
                    break;

                }
            }
            if (!alreadyChecked) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[j] == numbers[i]) {
                        System.out.println("Duplicate number: " + numbers[i]);
                        break;
                    }
                }
            }
        }
    }
}
////
import java.util.Scanner;
public class day4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to count:");
        int target = scanner.nextInt();
        int[] numbers = {10, 20, 10, 30, 40, 20};
        for (int i = 0; i < numbers.length; i++) {
              boolean alreadyChecked = false;
            for (int j =0; j < i; j++) {
                if (numbers[j] == numbers[i]) {
                    alreadyChecked = true;
                    break;

                }
            }
            if (!alreadyChecked) {
                int count = 0;
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[j] == numbers[i]) {
                        count++;
                    }
                }
                if (count > 0) {
                    System.out.println("Duplicate number: " + numbers[i] + " occurs " + (count + 1) + " times.");
                }
                }
            }
        }
    }
