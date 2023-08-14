package dowhileloop;

public class Dowhileloop4 {
    public static void main (String args[]){
        int i =2;
        do{
            if (i%2==0){
                System.out.println(i);
                i+=2;
            }

        }while( i<=100);
    }
}
