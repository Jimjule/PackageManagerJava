package com.company;

import java.util.Scanner;

public class Main {

    static Contact contact = new Contact();
    static String FirstName;

    public static void main(String[] args) {
	  System.out.println(0);
	  FirstName = getInput("first name");
	  contact.updateLastName(getInput("last name"));
//	  contact.LastName = getInput("last name");
	  System.out.println(FirstName);
	  System.out.println("Last name is: " + contact.LastName);
    }

    public static String getInput(String detail) {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Please enter your " + detail + ":");
        return getInput.nextLine();

    }
}
