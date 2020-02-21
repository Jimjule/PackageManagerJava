package com.company;

public class Contact {

    static String FirstName;
    static String LastName;

    public static void main(String[] args) {
    }

    static String returnFirstName() {
        return FirstName;
    }

    static void updateFirstName(String firstName) {
        FirstName = firstName;
    }
    static String returnLastName() {
        return LastName;
    }

    static void updateLastName(String lastName) {
        LastName = lastName;
    }
}