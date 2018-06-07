package tasks;

public class Factorial {

    public static void factorialFor (int a) {
        int factorial = 1;
        if (a >= 0 && a <= 14) {
            for (int i = 1; i <= a; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of number " + a + " is: " + factorial);
        } else {
            System.out.println("Please, use only numbers from 0 to 14");
        }
    }

    public static void factorialWhile (int a) {
        int factorial = 1;
        int i = 1;
        if (a >= 0 && a <= 14) {
            do {
                factorial *= i;
                i++;
            } while (i <= a);
            System.out.println("Factorial of number " + a + " is: " + factorial);
        } else {
            System.out.println("Please, use only numbers from 0 to 14");
        }
    }
}
