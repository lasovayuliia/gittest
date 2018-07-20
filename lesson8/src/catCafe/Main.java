package catCafe;

import Animals.*;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Yuliia", "Lasova", 24, null);
        Person person2 = new Person("Alex", "Green", 22, null);
        Person person3 = new Person("Olga", "Black", 32, null);

        Cat cat1 = new Cat("Funny", 1, "brittish", Pet.gender.Female, Cat.location.home, person1);
        Cat cat2 = new Cat("Kitty", Pet.gender.Male);
        Cat cat3 = new Cat();

        //Cat info
        System.out.println(cat1.info());
        System.out.println(cat2.toString());

        System.out.println("Person without cat: " + person1.toString());

        //Cat Cafe implementation
        Cat[] catArr1 = {cat1, cat2, cat3};
        CatCafe cafeWithYuliia = new CatCafe("Minsk", "Mon-Fri 9:00-17:00", catArr1);

        //Cat info from Cat Cafe
        cafeWithYuliia.printAllCats();
        cafeWithYuliia.printByBreed("British");

        //Cat is taken home
        cafeWithYuliia.takeHome(cat2, person1, "Fujii");
        System.out.println("Person with cat: " + person1.toString());

        System.out.println(cat2.toString());
        cafeWithYuliia.printAllCats();

        //Few new dogs
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Nobody", 2, Pet.gender.Male, null, "Husky");
        System.out.println(dog2.info());

//        Jynx jynx1 = new Jynx();
//        System.out.println(jynx1.info());

        //Dog is taken home
        person2.setPet(dog2, "Lucky");
        System.out.println("Person with dog: " + person2.toString());
        System.out.println(dog2.toString());

        //One new parrot and giving it owner
        Parrot parrot1 = new Parrot();
        person3.setPet(parrot1, "Binky");
        System.out.println(parrot1.info());
        System.out.println(person3.toString());



    }
}
