package catCafe;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Foxy", "Female");
        Cat cat3 = new Cat("Raccoon", "Male", "Scottish-Fold", false);
        Cat cat4 = new Cat("Gyzmo", "Female", "British", false);
        Cat cat5 = new Cat("Luna", "Female", "Unknown", false);
        Cat cat6 = new Cat("Black", "Male", "British", true);

        Cat[] catArr1 = {cat1, cat2, cat3, cat4, cat5, cat6};
        CatCafe cafeWithYuliia = new CatCafe("Minsk", "Mon-Fri 9:00-17:00", catArr1);

        cafeWithYuliia.printCafeInfo();
        cafeWithYuliia.printAllCats();
        cafeWithYuliia.printByBreed("British");
    }
}
