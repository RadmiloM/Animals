package animals;

public class Cat extends Animal implements AnimalDailyTasks {
    private Powers power;
    private static int numberOfCats = 0;

    public Cat(String name, int age, String breed, Powers power) {
        super(name, age, breed);
        this.power = power;
        numberOfCats++;
    }

    @Override
    public void eat() {
        System.out.println("cat is eating");
    }

    @Override
    public void walk() {
        System.out.println("cat is walking");
    }

    public static void catAndDogPlaying(Dog dog, Cat cat) {
        if (dog.getAge() < cat.getAge()) {
            System.out.println("Dog is younger than cat");
        } else {
            System.out.println("Dog is older than cat");
        }
    }


    @Override
    public void wakeUp() {
        System.out.println("Cat " + this.getName() + " just wake up");
    }

    @Override
    public void readBook() {
        System.out.println(this.getName() + " " + this.getBreed() + " is reading the book");
    }

    @Override
    public void math() {
        System.out.println(this.getName() + " is learning math");
    }

    @Override
    public void physics() {
        System.out.println(this.getName() + " is learning physics");
    }


}
