package catCafe;

import Animals.Cat;

import java.util.ArrayList;

public class CatCafe {
    private String address, workTime;
    private ArrayList<Cat> catList;
    private int catCnt;

    CatCafe(String address, String workTime, ArrayList<Cat> catList) {
        this.address = address;
        this.workTime = workTime;
        this.catList = catList;
        this.catCnt = catList.size();

        for (Cat cat : catList) {
            cat.setLocation(Cat.location.cafe);
        }
    }

    public void printCafeInfo() {
        System.out.println("-----" +
                "\nCafe address:\t" + address +
                "\nWork time:\t" + workTime +
                "\n-----");
    }

    public void printAllCats() {
        System.out.println("-----" +
                "\nOur cats:");
        for (int i = 0; i < catCnt; i++) {
            Cat c = catList.get(i);
            System.out.println("Name: " + c.getCatName() +
                    ", Breed: " + c.getCatBreed() +
                    ", Gender: " + c.getCatGender());
        }
        System.out.println("-----");
    }

    public void printByBreed(String breed) {
        System.out.println("-----" +
                "\nOur cats with breed \"" + breed + "\":");
        for (int i = 0; i < catCnt; i++) {
            Cat c = catList.get(i);
            if (c.getCatBreed().equals(breed)) {
                System.out.println("Name: " + c.getCatName() +
                        ", Gender: " + c.getCatGender());
            }
        }
        System.out.println("-----");
    }

    public void takeHome(Cat cat, Person person, String name) {
        ArrayList<Cat> arr1 = new ArrayList<Cat>();
        //int j = 0;
        for (int i = 0; i < catCnt; i++) {
            Cat c = catList.get(i);
            if (c != cat) {
                arr1.add(c);
                //j++;
            } else {
                c.setOwner(person);
                c.setLocation(Cat.location.home);
                person.setPet(c, name);
            }
        }
        catList = arr1;
        this.catCnt = catList.size();
    }

    public void takeHomeLeaveInfo(Cat cat, Person person, String name) {
        if (cat.getLocation().equals(Cat.location.home)) {
            System.out.println("Cat is already at home!");
        } else {
            for (int i = 0; i < catCnt; i++) {
                Cat c = catList.get(i);
                if (c == cat) {
                    c.setOwner(person);
                    c.setLocation(Cat.location.home);
                    person.setPet(c, name);
                    this.catCnt = catList.size();
                    break;
                }
            }
        }
    }
}