package animals;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal implements AnimalDailyTasks {
    private Powers powers;
    List<Dog> dogs;
    private static int numberOfDogs = 0;

    public Dog(String name, int age, String breed, Powers powers) {
        super(name, age, breed);
        this.powers = powers;
        dogs = new ArrayList<>();
        numberOfDogs++;
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }

    public void running() {
        System.out.println("Dog is running");
    }

    @Override
    public void walk() {
        System.out.println("dog is walking");
    }

    @Override
    public String toString() {
        return super.toString() + " " + powers.toString();
    }

    @Override
    public void wakeUp() {
        System.out.println(this.getName() + " wake up");
    }

    @Override
    public void readBook() {
        System.out.println(this.getName() + " is reading the books");
    }

    @Override
    public void math() {
        System.out.println(this.getName() + " is learning maths");
    }

    @Override
    public void physics() {
        System.out.println(this.getName() + " is learning physics");
    }


}
