package Animals;
import catCafe.Person;

public class Parrot extends Pet {

    public Parrot(String name, int age, gender gender, Person owner){
        super(name, age, gender, owner);
    }

    public Parrot(){
        this.name = "Corcky";
        this.age = 0;
        this.gender = gender.Female;
        this.setOwner(null);
    }
    @Override
    public String speak() {
        return "Squawk";
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
