package catCafe;


public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Foxy", Cat.gender.Female);
        Cat cat3 = new Cat("Raccoon", Cat.gender.Male, "Scottish-Fold", Cat.location.home);
        Cat cat4 = new Cat("Gyzmo", Cat.gender.Female, "British", Cat.location.home);
        Cat cat5 = new Cat("Luna", Cat.gender.Female, "Unknown", Cat.location.home);
        Cat cat6 = new Cat("Black", Cat.gender.Male, "British", Cat.location.home);
        Cat cat7 = new Cat("Whity", Cat.gender.Male, "British", Cat.location.cafe);

        Cat[] catArr1 = {cat1, cat2, cat3, cat4, cat5, cat6, cat7};
        CatCafe cafeWithYuliia = new CatCafe("Minsk", "Mon-Fri 9:00-17:00", catArr1);

        cafeWithYuliia.printCafeInfo();
        cafeWithYuliia.printAllCats();
        cafeWithYuliia.printByBreed("British");

        cafeWithYuliia.takeHome(cat3);
        cafeWithYuliia.takeHome(cat1);
        cafeWithYuliia.takeHome(cat7);
        cafeWithYuliia.printAllCats();
    }
}
