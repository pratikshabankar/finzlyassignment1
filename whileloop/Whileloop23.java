package whileloop;

public class Whileloop23 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int i = 0;

        while (i < 9) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            i++;
        }
    }
}
