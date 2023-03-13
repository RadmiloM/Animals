package animals;

public class LittleDog extends Dog {

    public LittleDog(String name, int age, String breed, Powers powers) {
        super(name, age, breed, powers);
    }


    public void play() {
        System.out.println(this.getName() + " is currently playing outside");
    }

    public void sleep() {
        System.out.println(this.getName() + " is sleeping right now");
    }

    public static void dogsPlaying(Dog dog, LittleDog littleDog) {
        System.out.println(dog.getName() + " is playing with " + littleDog.getName());
    }

}


