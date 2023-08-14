package forloopexamples;

public class ForloopEx14 {
    public static void main (String args[]){
        int countEven = 0;
        for(int i =1; i <=25; i++){
            if (i %2==0){
               countEven++;
            }
        }
        System.out.println(" count of even No 1 to 25 no is "+countEven);
    }
}
