package animals;

public class Dog extends Animal{
    private Powers powers;
    public Dog(String name, int age, String breed,Powers powers) {
        super(name, age, breed);
        this.powers = powers;
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void bark(){
        System.out.println("Dog is barking");
    }

    @Override
    public void walk() {
        System.out.println("dog is walking");
    }

    public String toString(){
       return  super.toString() + " " + powers.toString();
    }
}
