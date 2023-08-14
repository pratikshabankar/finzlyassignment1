package whileloop;

public class Whileloop14 {
    public static void main(String[] args) {
        int countEven = 0;
        int i = 1;

        while (i <= 25) {
            if (i % 2 == 0) {
                countEven++;
            }
            i++;
        }

        System.out.println("Count of even numbers from 1 to 25: " + countEven);
    }
}
