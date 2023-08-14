package dowhileloop;

public class Dowhileloop5 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        do {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        } while (i <= 50);

        System.out.println("Sum of odd numbers from 1 to 50: " + sum);
    }
}
