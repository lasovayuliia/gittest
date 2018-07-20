package catCafe;

import java.io.PrintStream;

public class MyException extends Exception {
    @Override
    public void printStackTrace(PrintStream s) {
        System.err.println("Cat is already at home!");
    }
}
