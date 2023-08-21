package InterfacesInJava;

 class Motorcycle implements Vehicle {

     @Override
     public void start() {
         System.out.println("motorcycle started");
     }

     @Override
     public void accelerate() {
         System.out.println("motorcycle accelerated");
     }

     @Override
     public void brake() {
         System.out.println("motorcycle braked");
     }
 }
