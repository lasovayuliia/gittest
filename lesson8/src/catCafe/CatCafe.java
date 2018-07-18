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

        for (int i = 0; i < catCnt; i++) {
            catArr[i].goToCafe();
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
                    ", Sex: " + catArr[i].getCatSex());
        }
        System.out.println("-----");
    }

    public void printByBreed(String breed) {
        System.out.println("-----" +
                "\nOur cats with breed \"" + breed + "\":");
        for (int i = 0; i < catCnt; i++) {
            if (catArr[i].getCatBreed().equals(breed)) {
                System.out.println("Name: " + catArr[i].getCatName() +
                        ", Sex: " + catArr[i].getCatSex());
            }
        }
        System.out.println("-----");
    }
}