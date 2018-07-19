package Animals;

import catCafe.Person;

public class Cat extends Pet {
    private String breed;
    protected location location;

    public enum location {cafe, home;}

    public Cat(String name, int age, String breed, gender gender, location location, Person owner) {
        super(name, age, gender, owner);
        this.breed = breed;
        this.location = location;
    }

    public Cat() {
        this.name = "Fluffy";
        this.age = 0;
        this.breed = "Unknown";
        this.gender = gender.Male;
        this.location = location.cafe;
        super.setOwner(null);
    }

    public Cat(String name, gender gender) {
        this.name = name;
        this.age = 0;
        this.breed = "Unknown";
        this.gender = gender;
        this.location = location.cafe;
        super.setOwner(null);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", location=" + location +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public String speak() {
        return "Meow";

    }

    public location getLocation() {
        return location;
    }

    public void setLocation(location location) {
        this.location = location;
    }

    public String getCatName() {
        return name;
    }

    public gender getCatGender() {
        return gender;
    }

    public String getCatBreed() {
        return breed;
    }

}
