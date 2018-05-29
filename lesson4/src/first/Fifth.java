package first;

public class Fifth {

    public static void summ(String numberLength) {
        String strNum = "";
        double sum = 0;
        try {
            int a = Integer.parseInt(numberLength);
            if (a > 0 && a < 100) {
                for (int i = 0; i < a; i++) { //generating of the number
                    int b = (int) (10 * Math.random());
                    strNum += b;
                    sum += b;
                }
                double b = sum / 3; //the number with fraction part
                int c = (int) b; //the number without fraction part

                System.out.println(strNum + ", " + b + ", " + c);

        /* try-catch part is to avoid the exception when user try to generate
        the number with more then 9 digits */
            } else {
                System.out.println("Please, use only numbers from 1 to 99");
            }
        } catch (Exception e) {
            System.out.println("Please, use only integer");
        }
    }
}
