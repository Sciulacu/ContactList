package ro.jademy.contactlist.model;

public class PhoneNumber {

    private String countryCode; // ex: +40
    private String number; // ex: 740123456

    public PhoneNumber(String number) {
        this.countryCode = "+40"; // default country code
        this.number = number;
    }

    public PhoneNumber(String countryCode, String number) {
        this.countryCode = countryCode;
        this.number = number;
    }
}
