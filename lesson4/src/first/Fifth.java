package first;

public class Fifth {

    public static void summ(String numberLength) {
        String strNum = "";
        int a = Integer.parseInt(numberLength);
        try {
            for (int i = 0; i < a; i++) { //generating of the number
                int b = (int) (10 * Math.random());
                strNum += b;
            }
            double b = (Integer.parseInt(strNum)) / 3; //the number with fraction part
            int c = (int) b; //the number without fraction part

            System.out.println(strNum + ", " + b + ", " + c);

        /* try-catch part is to avoid the exception when user try to generate
        the number with more then 9 digits */
        } catch (Exception e) {
            System.out.println("Please, use only numbers from 1 to 9");
        }
    }
}
