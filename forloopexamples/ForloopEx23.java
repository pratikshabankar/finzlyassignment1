package forloopexamples;

public class ForloopEx23 {
    public static void main(String[] args) {
        int a = 0, b = 1;

        for (int i = 0; i < 9; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
