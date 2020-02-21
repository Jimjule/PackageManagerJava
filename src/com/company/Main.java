package com.company;

import java.util.Scanner;

public class Main {

    static Contact contact = new Contact();

    public static void main(String[] args) {
	  contact.updateFirstName(getInput("first name"));
	  contact.updateLastName(getInput("last name"));
	  System.out.println("First name is: " + contact.FirstName);
	  System.out.println("Last name is: " + contact.LastName);
    }

    public static String getInput(String detail) {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Please enter your " + detail + ":");
        return getInput.nextLine();

    }
}
