package catCafe;

import Animals.Pet;

public class Person {
    private String firstName, lastName;
    private int age;
    private Pet pet;

    Person(String firstName, String lastName, int age, Pet pet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pet = pet;
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

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet, String name) {
        this.pet = pet;
        pet.name = name;
        pet.setOwner(this);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pet=" + pet +
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
