package Animals;

public abstract class Animal {

    public abstract String speak();

    public String info() {
        return this.getClass() + "\nSound: " + this.speak();
    }
}
