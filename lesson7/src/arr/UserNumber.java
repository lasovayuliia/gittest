package arr;

class UserNumber {
    private String number, country, city, telType;

    UserNumber(String number, String country, String[] arr) {
        this.number = number;
        this.country = country;
        this.city = arr[0];
        this.telType = arr[1];
    }

    public void print() {
        System.out.println("-----" +
                "\nNumber:\t" + number +
                "\nCountry:\t" + country +
                "\nCity or operator:\t" + city +
                "\nPhone type:\t" + telType +
                "\n-----");
    }
}
