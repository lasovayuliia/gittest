package Animals;

import catCafe.Person;

public class Dog extends Pet {
    private String breed;

    public Dog(String name, int age, gender gender, Person owner, String breed) {
        super(name, age, gender, owner);
        this.breed = breed;
    }

    public Dog() {
        this.name = "Buddy";
        this.age = 0;
        this.gender = gender.Male;
        this.breed = "Unknown";
        this.setOwner(null);
    }

    @Override
    public String speak() {
        return "Bark";
    }
}
