package catCafe;

import Animals.Pet;

import java.util.HashMap;
import java.util.Map;

public class Person {
    private String firstName, lastName;
    private int age;
    private Map<String, Pet> petMap;

    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.petMap = new HashMap<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<String, Pet> getPetMap() {
        return petMap;
    }

    public void setPet(Pet pet, String name) {
        pet.name = name;
        pet.setOwner(this);
        petMap.put(pet.name, pet);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pet=" + petMap +
                '}';
    }

    public String info() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

}
