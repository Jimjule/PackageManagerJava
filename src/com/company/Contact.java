package com.company;

public class Contact {
    static String LastName;

    public static void main(String[] args) {
    }

    static String returnLastName() {
        return LastName;
    }

    static void updateLastName(String lastName) {
        LastName = lastName;
    }
}