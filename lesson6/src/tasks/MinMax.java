package tasks;

import java.util.*;

public class MinMax {
    private static int number = 0;
    private static int i = 1;
    private static int[] arr = new int[4];

    public static void first() {
        System.out.println("Hello, human!\n" +
                "Wanna see some magic? There are some rules:\n" +
                "1) use only digits\n" +
                "2) use only integer\n");
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Please, enter the number #" + i);
            String s = in.nextLine();
            if (intValidation(s)) {
                number = Integer.parseInt(s);
                System.out.println("Your number is " + number);
                arr[i - 1] = number;
                if (4 == i) {
                    int min = minNumber(arr[0], arr[1], arr[2], arr[3]);
                    int max = maxNumber(arr[0], arr[1], arr[2], arr[3]);
                    System.out.println("The smallest number is: " + min);
                    System.out.println("The biggest number is: " + max);
                }

            } else {
                System.out.println("Please, use only integer! Let's try again.");
                i--;
            }
            i++;
        } while (i <= 4);
        in.close();
    }

    private static int minNumber(int a, int b, int c, int d) {
        return Math.min(Math.min(a, b), Math.min(c, d));
    }

    private static int maxNumber(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }

    private static boolean intValidation(String a) {
        try {
            int b = Integer.parseInt(a);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
