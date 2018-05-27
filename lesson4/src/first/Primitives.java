package first;

public class Primitives {

    // byte min and max value
    private static byte byte_v1 = Byte.MIN_VALUE;
    private static byte byte_v2 = Byte.MAX_VALUE;
    // short min and max value
    private static short short_v1 = Short.MIN_VALUE;
    private static short short_v2 = Short.MAX_VALUE;
    // double min and max value
    private static double double_v1 = Double.MIN_VALUE;
    private static double double_v2 = Double.MAX_VALUE;
    // char min and max value
    private static char char_v1 = Character.MIN_VALUE;
    private static char char_v2 = Character.MAX_VALUE;

    public static void printPrimitives() {
        System.out.println("byte min value: " + byte_v1);
        System.out.println("byte max value: " + byte_v2);
        System.out.println("short min value: " + short_v1);
        System.out.println("short max value: " + short_v2);
        System.out.println("double min value: " + double_v1);
        System.out.println("double max value: " + double_v2);
        System.out.println("char min value: " + (int) char_v1);
        System.out.println("char max value: " + (int) char_v2);
    }
}
