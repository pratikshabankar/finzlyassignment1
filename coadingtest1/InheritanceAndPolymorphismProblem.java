package coadingtest1;
class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {

    }
}

// Derived classes
class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("The lion sound");
    }
}

class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("The elephant sound.");
    }
}

class   Giraffe extends Animal {
    public Giraffe(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("The giraffe sound.");
    }
}

// Zoo class
class Zoo {
    private Animal[] animals;
    private int count =0;

    public Zoo(int capacity) {
        animals = new Animal[capacity];

    }

    public void addAnimal(Animal animal) {
        if (count < animals.length) {
            animals[count] = animal;
            count++;
        }
    }

    public void makeAllSounds() {
        for (int i = 0; i < count; i++) {
            animals[i].makeSound();
        }
    }
}

public class InheritanceAndPolymorphismProblem {
    public static void main(String[] args) {
        Zoo z = new Zoo(3);

        Lion l = new Lion("Simba", 5);
        Elephant e = new Elephant("Dumbo", 10);
        Giraffe g = new Giraffe("Geoffrey", 7);

        z.addAnimal(l);
        z.addAnimal(e);
        z.addAnimal(g);

        z.makeAllSounds();
    }
}

