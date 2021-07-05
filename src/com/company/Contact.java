package com.company;

public class Contact {

    static String FirstName;
    static String LastName;
    static String Address;
    static String PhoneNumber;
    static String DOB;
    static String Email;

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

    static String returnAddress() {
        return Address;
    }

    static void updateAddress(String address) {
        Address = address;
    }

    static String returnPhoneNumber() {
        return PhoneNumber;
    }

    static void updatePhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    static String returnDOB() {
        return DOB;
    }

    static void updateDOB(String dOB) {
        DOB = dOB;
    }

    static String returnEmail() {
        return Email;
    }

    static void updateEmail(String email) {
        Email = email;
    }
}