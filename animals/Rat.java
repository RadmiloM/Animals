package animals;


public class Rat extends Animal{

    public Rat(String name, int age, String breed) {
        super(name, age, breed);
    }

    @Override
    public void eat() {
        System.out.println("rat is eating");
    }

    @Override
    public void walk(){
        System.out.println("Rat is walking");
    }


}
