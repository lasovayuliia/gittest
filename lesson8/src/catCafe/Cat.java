package catCafe;

public class Cat {
    private String name;
    private String sex;
    private String breed;
    private boolean catCafeFlag;

    Cat(String name, String sex, String breed, boolean catCafeFlag) {
        this.name = name;
        this.sex = sex;
        this.breed = breed;
        this.catCafeFlag = catCafeFlag;
    }

    Cat() {
        this.name = "Fluffy";
        this.sex = "Male";
        this.breed = "Unknown";
        this.catCafeFlag = true;
    }

    Cat(String name, String sex) {
        this.name = name;
        this.sex = sex;
        this.breed = "Unknown";
        this.catCafeFlag = true;
    }

    private boolean getCatCafeFlag() {
        return catCafeFlag;
    }

    private void setCatCafeFlagFalse() {
        this.catCafeFlag = false;
    }

    private void setCatCafeFlagTrue() {
        this.catCafeFlag = true;
    }

    public String getCatName() {
        return name;
    }

    public String getCatSex() {
        return sex;
    }

    public String getCatBreed() {
        return breed;
    }

    public void goHome() {
        setCatCafeFlagFalse();
    }

    public void goToCafe() {
        setCatCafeFlagTrue();
    }


}
