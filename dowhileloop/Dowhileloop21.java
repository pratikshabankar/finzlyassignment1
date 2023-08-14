package dowhileloop;

public class Dowhileloop21 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        do {
            sum += i;
            System.out.print(sum + " ");
            i++;
        } while (i <= 9);
    }
}
