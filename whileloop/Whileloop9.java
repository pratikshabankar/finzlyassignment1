package whileloop;

public class Whileloop9 {
    public static void main (String [] args){
        int i = 1;
        int sumOdd = 0;
        int sumEven = 0;
        while(i<=50){
            if(i%2==0){
                sumEven += i;
            }
            else{
                sumOdd += i;
            }
            i++;
        }
        System.out.println("Sum of odd numbers from 1 to 50: " + sumOdd);
        System.out.println("Sum of even numbers from 1 to 50: " + sumEven);
    }
}
