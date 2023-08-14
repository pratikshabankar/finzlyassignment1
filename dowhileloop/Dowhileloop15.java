package dowhileloop;

public class Dowhileloop15 {
    public static void main(String[] args) {
        int countEven = 0;
        int i = 1;

        do {
            if (i % 2 != 0) {
                countEven++;
            }
            i++;
        } while (i <= 25);

        System.out.println("Count of even numbers from 1 to 25: " + countEven);
    }
}
