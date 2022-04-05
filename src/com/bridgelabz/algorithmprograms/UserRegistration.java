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
        System.out.println(isValidLastName.validate("^[A-Z]{1}[a-z]{2,}$", "Gowda"));

        Validation isValidMobileNumber = (pattern, mobileNumber) -> {
            return "Mobile number is " + Pattern.compile(pattern).matcher(mobileNumber).matches();
        };
        System.out.println(isValidMobileNumber.validate("^[91]+[ ]?[6-9]{1}[0-9]{9}$", "91 7760973591"));

        Validation isValidEmail = (pattern, email) -> {
            return "Email is " + Pattern.compile(pattern).matcher(email).matches();
        };
        System.out.println(isValidEmail.validate("^[a-z]+[+-_.]*[a-z]*[@][a-z]+[.][a-z]{2,4}[.]*([a-z]{2})*$",
                "archana.gow@gmail.com"));

        Validation isValidPassword1 = (pattern, password) -> {
            return "Password rule is " + Pattern.compile(pattern).matcher(password).matches();
        };
        System.out.println(isValidPassword1.validate("^[0-9a-zA-Z!,@#$&*().]{8,}$", "Archana@"));


    }
}