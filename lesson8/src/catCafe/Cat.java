package catCafe;

public class Cat {
    private String name;
    private static gender gender;
    private String breed;
    private static location location;

    public enum location {cafe, home}

    public enum gender {Male, Female}

    Cat(String name, gender gender, String breed, location location) {
        this.name = name;
        this.breed = breed;
        Cat.gender = gender;
        Cat.location = location;
    }

    Cat() {
        this.name = "Fluffy";
        gender = Cat.gender.Male;
        this.breed = "Unknown";
        location = Cat.location.home;
    }

    Cat(String name, gender gender) {
        this.name = name;
        Cat.gender = gender;
        this.breed = "Unknown";
        location = Cat.location.cafe;
    }

    public location getLocation() {
        return location;
    }

    public void setLocation(location location) {
        Cat.location = location;
    }

    public String getCatName() {
        return name;
    }

    public gender getCatGender() {
        return gender;
    }

    public String getCatBreed() {
        return breed;
    }
}
