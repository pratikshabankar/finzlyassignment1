package dowhileloop;

public class Dowhileloop20 {
    public static void main(String[] args) {
        int power = 0;
        int i= 1;

        do {
            System.out.print(i + " ");
              i *= 10;
            power++;
        } while (power <= 3);
    }
}
