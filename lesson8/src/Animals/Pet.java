package Animals;

import catCafe.Person;

public abstract class Pet implements Animal {
    protected Pet() {
    }

    public enum gender {Male, Female}

    protected gender gender;
    public String name;
    protected int age;
    private Person owner;

    Pet(String name, int age, gender gender, Person owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.gender = gender;
    }

    public String info() {
        return "Pet's name: " + name + "\n" +
                this.getClass() + "\nSound: " + this.speak() +
                "\n----";
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

}
