package catCafe;

import Animals.Cat;
import Animals.Dog;
import Animals.Jynx;
import Animals.Pet;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Yuliia", "Lasova", 24);

        Cat cat1 = new Cat("Funny", 1, "brittish", Pet.gender.Female, Cat.location.home, person1);
        Cat cat2 = new Cat("Fujy", Pet.gender.Male);
        Cat cat3 = new Cat();
//        Cat cat4 = new Cat("Gyzmo", Cat.gender.Female, "British", Cat.location.home);
//        Cat cat5 = new Cat("Luna", Cat.gender.Female, "Unknown", Cat.location.home);
//        Cat cat6 = new Cat("Black", Cat.gender.Male, "British", Cat.location.home);
//        Cat cat7 = new Cat("Whity", Cat.gender.Male, "British", Cat.location.cafe);
        System.out.println(cat1.info());
        System.out.println(cat2.toString());

        Cat[] catArr1 = {cat1, cat2, cat3};
        CatCafe cafeWithYuliia = new CatCafe("Minsk", "Mon-Fri 9:00-17:00", catArr1);
        cafeWithYuliia.printAllCats();
        cafeWithYuliia.printByBreed("British");
        cafeWithYuliia.takeHome(cat2, person1);

        System.out.println(cat2.toString());
        cafeWithYuliia.printAllCats();

        Dog dog1 = new Dog();
        System.out.println(dog1.info());

        Jynx jynx1 = new Jynx();
        System.out.println(jynx1.info());


    }
}
