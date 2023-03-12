package animals;

public abstract class Animal {

    private String name;
    private int age;
    private String breed;

    public Animal(String name,int age,String breed){
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return this.breed;
    }

    public String toString(){
        return this.name + " " + this.age + " " + this.breed;
    }

    public abstract void eat();

    public void walk(){
        System.out.println("Animal walks");
    }

    public static void animalKingdom(){
        System.out.println("Kingdom of all animals");
    }

}
