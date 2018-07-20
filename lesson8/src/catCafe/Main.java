package catCafe;

import Animals.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Yuliia", "Lasova", 24);
        Person person2 = new Person("Alex", "Green", 22);
        Person person3 = new Person("Olga", "Black", 32);
        Person person4 = new Person("Kate", "Black", 30);

        Cat cat1 = new Cat("Funny", 1, "brittish", Pet.gender.Female, Cat.location.home, person1);
        Cat cat2 = new Cat("Kitty", Pet.gender.Male);
        Cat cat3 = new Cat();
        Cat cat4 = new Cat("Foxy", 2, "brittish", Pet.gender.Female, Cat.location.home, person4);

        //Cat Cafe implementation
        ArrayList<Cat> catArr1 = new ArrayList<Cat>();
        catArr1.add(cat1);
        catArr1.add(cat2);
        catArr1.add(cat3);
        catArr1.add(cat4);
        CatCafe cafeWithYuliia = new CatCafe("Minsk", "Mon-Fri 9:00-17:00", catArr1);

        //Few new dogs
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Nobody", 2, Pet.gender.Male, null, "Husky");
//        System.out.println(dog2.info());

        //Dog is taken home
        person2.setPet(dog2, "Lucky");

        //One new parrot and giving it owner
        Parrot parrot1 = new Parrot();
        person3.setPet(parrot1, "Binky");

        System.out.println("Person without pets: " + person1.toString());

        //Cat is taken home, but info is still saved in Cafe
        cafeWithYuliia.takeHomeLeaveInfo(cat2, person1, "Fujii");
        cafeWithYuliia.takeHomeLeaveInfo(cat2, person2, "Kate");

        person1.setPet(dog1, "Lucy");
        person1.setPet(parrot1, "Coco");
        System.out.println("Person with pets: " + person1.toString());/**/
    }
}
