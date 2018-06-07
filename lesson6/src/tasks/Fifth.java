package tasks;

public class Fifth {

    public static void fifth() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j*i + "\t");
                if (10 == j) {
                    System.out.print("\n");
                }
            }
        }
    }
}
