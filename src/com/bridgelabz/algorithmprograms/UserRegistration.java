package com.bridgelabz.algorithmprograms;

import java.util.regex.Pattern;

/**
 * Author:-Archana
 * Date:-04/04/2022
 */

interface Validation {
    String validate(String regex, String userDetails);
}

public class UserRegistration {

    public static void main(String[] args) {
        System.out.println("Welcome to lambda user-registation program");

        Validation isValidFirstName = (pattern, firstName) -> {
            return "First Name is " + Pattern.compile(pattern).matcher(firstName).matches();
        };
        System.out.println(isValidFirstName.validate("^[A-Z]{1}[a-z]{2,}$", "Archana"));

        Validation isValidLastName = (pattern, lastName) -> {
            return "Last Name is " + Pattern.compile(pattern).matcher(lastName).matches();
        };
        System.out.println(isValidLastName.validate("^[A-Z]{1}[a-z]{2,}$", "Kanojia"));

        Validation isValidMobileNumber = (pattern, mobileNumber) -> {
            return "Mobile number is " + Pattern.compile(pattern).matcher(mobileNumber).matches();
        };
        System.out.println(isValidMobileNumber.validate("^[91]+[ ]?[6-9]{1}[0-9]{9}$", "91 7760973591"));

    }
}