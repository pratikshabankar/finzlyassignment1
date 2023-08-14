package dowhileloop;

public class Dowhileloop10 {
    public static void main(String[] args) {
        int i = 1;

        System.out.println("Even numbers:");
        do {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
            i++;
        } while (i <= 50);

        System.out.println("\nOdd numbers:");
        i = 1; // Reset the value of i
        do {
            if (i % 2 != 0) {
                System.out.println(i + " ");
            }
            i++;
        } while (i <= 50);
    }

}
