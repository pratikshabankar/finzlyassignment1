package forloopexamples;

public class ForloopEx10 {
    public static void main (String[] args){
        System.out.print(" the even numbers are  ");
        for(int i =1; i<=50;i++){
            if(i%2==0){
                System.out.println(i+" ");

            }

        }

        System.out.print(" the odd numbers are   ");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i );
            }
        }
    }
}
