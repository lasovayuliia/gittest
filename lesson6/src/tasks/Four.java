package tasks;

public class Four {

    public static void odd() {
        int x = 0;
        for (int i = 1; i < 99; i++) {
            if (10 == x) {
                break;
            }
            if (i % 9 == 0  || i % 2 == 0) {
                continue;
            }
            System.out.println(i);
            x++;
        }
    }
}
