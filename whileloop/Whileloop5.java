package whileloop;

public class Whileloop5 {
    public static void main(String[] args) {
        int i = 1;
        int sumOdd =0;
        while (i <= 50) {
            sumOdd +=i;
            i+=2;
        }
        System.out.println("Sum of odd numbers from 1 to 50: " + sumOdd);
    }
}
