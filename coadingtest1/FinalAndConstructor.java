package coadingtest1;
class Antivirus{
    private  final String productKey;
    private boolean activated;

    public Antivirus(String productKey) {
        this.productKey = productKey;
        this.activated = false;
    }

    public void processTransaction(boolean transactionDone) {
        if (transactionDone) {
            System.out.println("Transaction approved.");
            activated = true;
        } else {
            System.out.println("Transaction is not done - please pay first to activate product key.");
        }
    }
    public void checkStatus(){
        if (activated){
            System.out.println("antivirus activated");
        }
        else {
            System.out.println("You are using the free version, please upgrade.");
        }
    }
}

public class FinalAndConstructor {
    public static void main(String[] args){
        Antivirus a =new Antivirus("abc123");

        a.checkStatus();
        a.processTransaction(true);

        a.processTransaction(false);
        a.checkStatus();
    }
}
