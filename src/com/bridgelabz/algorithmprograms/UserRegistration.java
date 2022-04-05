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

    }
}