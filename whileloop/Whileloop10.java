package whileloop;

public class Whileloop10 {
    public static void main(String[] args) {
        int i = 1;

        System.out.println("Even numbers:");
        while (i <= 50) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println("\nOdd numbers:");
        i = 1;
        while (i <= 50) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
