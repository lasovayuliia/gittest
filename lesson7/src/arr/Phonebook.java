package arr;

import java.util.*;

class Phonebook {

    private static Map<String, String> phone2country = new HashMap<>();

    static {
        phone2country.put("380", "UA");
        phone2country.put("375", "BY");
        phone2country.put("7", "RU");
    }

    private static Map<String, String[]> cityBY = new HashMap<>();

    static {
        cityBY.put("17", new String[]{"Minsk", "Home"});
        cityBY.put("232", new String[]{"Gomel", "Home"});
        cityBY.put("291", new String[]{"Velcom", "Mobile"});
        cityBY.put("25", new String[]{"Life", "Mobile"});
    }

    private static Map<String, String[]> cityRU = new HashMap<>();

    static {
        cityRU.put("495", new String[]{"Moscow", "Home"});
        cityRU.put("812", new String[]{"St. Petersburg", "Home"});
        cityRU.put("929", new String[]{"Megafon", "Mobile"});
    }

    private static Map<String, String[]> cityUA = new HashMap<>();

    static {
        cityUA.put("44", new String[]{"Kyiv", "Home"});
        cityUA.put("63", new String[]{"Life", "Mobile"});
        cityUA.put("66", new String[]{"MTC", "Mobile"});
    }

    private static String getCountry(String code) {
        return phone2country.get(code);
    }

    private static String[] getCity(String countryCode, String cityCode) {
        switch (countryCode) {
            case "BY": {
                return cityBY.get(cityCode);
            }
            case "UA": {
                return cityUA.get(cityCode);
            }
            case "RU": {
                return cityRU.get(cityCode);
            }
        }
        return new String[]{};
    }

    public static void parseNumber(String number) {
        String pattern = "[1-9]\\d{0,2}-\\d{1,5}-\\d{5,7}";
        if (number.matches(pattern)) {
            try {
                String[] num = number.split("-");
                String country = Phonebook.getCountry(num[0]);
                String[] info = Phonebook.getCity(country, num[1]);
                UserNumber user = new UserNumber(number, country, info);
                user.print();
            } catch (Exception e) {
                System.out.println("Number: " + number + "\nSorry, I don't know such code!");
            }
        } else {
            System.out.println("Number: " + number + "\nWrong format!");
        }
    }
}
