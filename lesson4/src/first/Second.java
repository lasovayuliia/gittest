package first;

import first.taskTwo.Snake;

public class Second {
    private static Integer int1 = 42;
    private static String str1 = "String One";
    private static String str2 = new String("String Two");
    private static Snake snake1 = new Snake();

    public static void printLinked() {
        System.out.println("Integer: " + int1);
        System.out.println("String: " + str1);
        System.out.println("String: " + str2);
        System.out.println("Snake: " + String.valueOf(snake1.SnakesToParrot(3)) );

    }
}
