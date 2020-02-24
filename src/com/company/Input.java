package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Input {

    public static void main(String[] args) {
    }

    public static String confirmInput(String detail) {
        String input = getInput(detail);
        Boolean validInput = validateInput(detail, input);
        if (validInput == false) {
            confirmInput(detail);
        }
        return input;
    }

    public static String getInput(String detail) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your " + detail + ":");
        String input = userInput.nextLine();
        return input;
    }

    public static Boolean validateInput(String detail, String input) {
        if (detail == "phone number") {
            return validatePhoneNumber(input);
        } else {
            return true;
        }
    }

    public static Boolean validatePhoneNumber(String phoneNumber) {
        return validNumber(phoneNumber);
    }

    public static Boolean validNumber(String phoneNumber) {
        Pattern phonePattern = Pattern.compile("^[\\d]+$");
        return phoneNumber.matches(String.valueOf(phonePattern));
    }

    public static Boolean validDOB(String dOB) {
        Pattern dOBPattern = Pattern.compile("(\\d{2}\\/\\d{2}\\/\\d{2})");
        return dOB.matches(String.valueOf(dOBPattern));
    }
}
