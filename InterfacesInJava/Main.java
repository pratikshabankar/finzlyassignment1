package InterfacesInJava;

public class Main {
    public static void main(String [] args){
        Car car = new Car();
        Motorcycle motorcycle =new Motorcycle();
        car.start();
        car.accelerate();
        car.brake();

        System.out.println("    ");

        motorcycle.start();
        motorcycle.accelerate();
        motorcycle.brake();

    }
}
