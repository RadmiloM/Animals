package animals;

public class Cat extends Animal{
    private Powers power;
    public Cat(String name, int age, String breed,Powers power) {
        super(name, age, breed);
        this.power = power;
    }

    @Override
    public void eat() {
        System.out.println("cat is eating");
    }
    @Override
    public void walk(){
        System.out.println("cat is walking");
    }

    public static void catAndDogPlaying(Dog dog,Cat cat){
        if(dog.getAge() < cat.getAge()){
            System.out.println("Dog is younger than cat");
        }else{
            System.out.println("Dog is older than cat");
        }
    }



}
