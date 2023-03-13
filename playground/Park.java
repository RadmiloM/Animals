package playground;

import animals.Cat;
import animals.Dog;
import animals.LittleDog;
import animals.Rat;

import java.time.LocalDateTime;

public class Park {


    public static void whoIsInThePark(Dog dog, LittleDog littleDog, Cat cat, Rat rat) {
        System.out.println("Animals in the park are: " + dog.getName() + " "
                + littleDog.getName() + " " + cat.getName() + " " + rat.getName());
    }

    public static void currentTime() {
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println(String.valueOf(currentTime).substring(11, 19));
    }

    public static String oldestAnimalInThePark(Dog dog, LittleDog littleDog, Cat cat, Rat rat) {
        if (dog.getAge() > littleDog.getAge() && dog.getAge() > cat.getAge() && dog.getAge() > rat.getAge()) {
            return dog.getName() + " is the oldest in the park";
        } else if (littleDog.getAge() > dog.getAge() && littleDog.getAge() > cat.getAge() && littleDog.getAge() > rat.getAge()) {
            return littleDog.getName() + " is the oldest in the park";
        } else if (cat.getAge() > littleDog.getAge() && cat.getAge() > dog.getAge() && cat.getAge() > rat.getAge()) {
            return cat.getName() + " is the oldest in the park";
        } else if (rat.getAge() > dog.getAge() && rat.getAge() > littleDog.getAge() && rat.getAge() > cat.getAge()) {
            return rat.getName() + " is the oldest in the park";
        } else {
            return "all animals have equal age";
        }
    }

}
