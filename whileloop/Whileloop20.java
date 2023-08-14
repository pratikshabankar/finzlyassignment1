package whileloop;

public class Whileloop20 {
    public static void main(String[] args) {
        int power = 0;
        int i = 1;

        while (power <= 3) {
            System.out.print(i + " ");
            i *= 10;
            power++;
        }
    }

}
