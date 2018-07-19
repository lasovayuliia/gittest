package catCafe;

public class CatCafe {
    private String address, workTime;
    private Cat[] catArr;
    private int catCnt;

    CatCafe(String address, String workTime, Cat[] catArr) {
        this.address = address;
        this.workTime = workTime;
        this.catArr = catArr;
        this.catCnt = catArr.length;

        for (Cat cat : catArr) {
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
            System.out.println("Name: " + catArr[i].getCatName() +
                    ", Breed: " + catArr[i].getCatBreed() +
                    ", Gender: " + catArr[i].getCatGender());
        }
        System.out.println("-----");
    }

    public void printByBreed(String breed) {
        System.out.println("-----" +
                "\nOur cats with breed \"" + breed + "\":");
        for (int i = 0; i < catCnt; i++) {
            if (catArr[i].getCatBreed().equals(breed)) {
                System.out.println("Name: " + catArr[i].getCatName() +
                        ", Gender: " + catArr[i].getCatGender());
            }
        }
        System.out.println("-----");
    }

    public void takeHome(Cat cat) {
        Cat[] arr1 = new Cat[catCnt - 1];
        int j = 0;
        for (int i = 0; i < catCnt; i++) {
            if (catArr[i] == cat) {
                cat.setLocation(Cat.location.home);
            }
                else {
                arr1[j] = catArr[i];
                j++;
            }
        }
        catArr = arr1;
        this.catCnt = catArr.length;
    }
}