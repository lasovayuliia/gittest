package first;

public class Third {
    private static final double a = 3;
    private static int b = (int) 3.14;
    private static int number;
    private static String strNumber = "10";
    private static String oneMoreString = "";

    public static void printThird() {
        number = Integer.parseInt(strNumber);
        oneMoreString = String.valueOf(number);

        System.out.println(a);
        System.out.println(b);
        System.out.println(number);
        System.out.println(oneMoreString);

    }
}
