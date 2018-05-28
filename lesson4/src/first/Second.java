package first;

import first.taskTwo.Snake;

public class Second {
    private static Integer int1 = 42;
    private static String str1 = "String One";
    private static String str2 = new String("String Two");
    private static Snake snake1 = new Snake();

    public static void printLinked() {
        System.out.println(int1.getClass() + ", " + int1);
        System.out.println(str1.getClass() + ", " + str1);
        System.out.println(str2.getClass() + ", " + str2);
        System.out.println(snake1.getClass() + ", " + String.valueOf(snake1.SnakesToParrot(3)) );

    }
}
