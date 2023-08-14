package dowhileloop;

public class Dowhileloop23 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int i = 0;

        do {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            i++;
        } while (i < 9);
    }
}
