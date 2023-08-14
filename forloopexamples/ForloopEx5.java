package forloopexamples;

public class ForloopEx5 {
    public static void main (String[] args){
        int sum =0;
        for(int i= 1;i<=50;i+=2){
            sum =sum+i;
        }
        System.out.println("sum of odd numbers from 1 to 50 ="+sum);
    }
}
