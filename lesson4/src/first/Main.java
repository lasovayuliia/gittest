package first;

public class Main {
    //task 4 - const
    static final int CONST_1 = 25;
    static final float CONST_2 = 4.24f;
    static final char CONST_3 = 'h';


    public static void main(String[] args) {
        // uncomment the line below to see min and max values of primitives
        //Primitives.printPrimitives();

        //task 2:
        System.out.println("Task 2:");
        Second.printLinked();
        System.out.println("");

        System.out.println("Task 3:");
        Third.printThird();
        System.out.println("");

        System.out.println("Task 5:");
        Fifth.summ("97");
        System.out.println("");
    }
}
