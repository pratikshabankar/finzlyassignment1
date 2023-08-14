package forloopexamples;

public class ForloopEx9 {
    public static void main (String[] args){
        int sumEven=0;
        int sumOdd=0;
        for (int i=1;i<=50;i++){

            if(i%2==0){
                sumEven=sumEven+i;

            }
            else{
                sumOdd= sumOdd+i;
            }

            
        }
        System.out.println("sum of odd no from 1 to 50="+sumEven);
        System.out.println("sum of odd no from 1 to 50="+sumOdd);

    }
}
