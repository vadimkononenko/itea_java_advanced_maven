package com.itea.homeworks.utils.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ValidationUtils {
    public static boolean validatorPhoneNumber(String number) {
        String regexNumber = "^[38][0-9]{11}$";
        Pattern pattern = Pattern.compile(regexNumber);
        Matcher matcher = pattern.matcher(number);

        return matcher.matches();
    }

    public static boolean validatorEmail(String email) {
        String regexEmail = "^[a-z0-9.]+@[a-z0-9]{2,6}[.][a-z]{2,6}$";
        Pattern pattern = Pattern.compile(regexEmail);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }

    public static boolean validatorIP(String ip) {
        String regexIP = "\"^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$\"";
        Pattern pattern = Pattern.compile(regexIP);
        Matcher matcher = pattern.matcher(ip);

        return matcher.matches();
    }
}
