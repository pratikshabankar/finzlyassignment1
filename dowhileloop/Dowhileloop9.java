package dowhileloop;

public class Dowhileloop9 {
    public static void main(String[] args) {
        int sumOdd = 0;
        int sumEven = 0;
        int i = 1;

        do {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
            i++;
        } while (i <= 50);

        System.out.println("Sum of odd numbers from 1 to 50: " + sumOdd);
        System.out.println("Sum of even numbers from 1 to 50: " + sumEven);
    }
    }


