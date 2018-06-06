package arr;

//import java.util.HashMap;
import java.util.*;

class UserNumber {
    String number, countryCode;

    public UserNumber (String number) {
        this.number = number;
        String[] num = number.split("-");
        this.countryCode = num[0];
    }

    public static void parseNumber(String number) {
        String pattern = "[1-9][0-9]{0,2}-[0-9]{1,5}-[0-9]{5,7}";
        if (number.matches(pattern)) {
            System.out.println("Ok");
            //System.out.println(num[0] + " " + num[1] + " " + num[2]);

        }
    }

    public static void codes() {
        Phonebook code1 = new Phonebook("Ukraine",  "38");
        Phonebook code2 = new Phonebook("Russia", "7");
        Phonebook code3 = new Phonebook("Belarus",  "375");
    }
}
