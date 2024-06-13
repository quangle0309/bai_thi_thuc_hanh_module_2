package common;

public class RegexHandler {
    private static final String NAME_REGEX = "^[a-zA-Z ]{4,50}$";
    private static final String DATE_REGEX = "^(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[012])-(\\d{4})$";
    private static final String PHONE_NUMBER_REGEX = "^0?[0-9]{9,10}$";


    public static boolean isValidName(String name) {
        return name.matches(NAME_REGEX);
    }

    public static boolean isValidDate(String name) {
        return name.matches(DATE_REGEX);
    }

    public static boolean isValidPhoneNumber(String phoneNumber){
        return phoneNumber.matches(PHONE_NUMBER_REGEX);
    }

}
