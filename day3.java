
public class day3 {
        public static void printEvenNumber(int n) {
            System.out.println(n);
        }

        public static void main (String[] args) {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    printEvenNumber(i);
                }
            }
        }
    }
