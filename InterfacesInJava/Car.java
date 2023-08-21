package InterfacesInJava;

class Car implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("car accelerated");
    }

    @Override
    public void brake() {
        System.out.println("car braked");
    }

    @Override
    public void start() {
        System.out.println("car started");
    }
}
