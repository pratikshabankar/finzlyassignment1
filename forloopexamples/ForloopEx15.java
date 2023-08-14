package forloopexamples;

public class ForloopEx15 {
    public static void main ( String [] args){
        int countOdd = 0;
        for(int i =1;i<=25;i++){
            if(i%2 !=0){
                countOdd++;

            }
        }
        System.out.println("count of odd No 1 to 25 no is "+countOdd);
    }
}
