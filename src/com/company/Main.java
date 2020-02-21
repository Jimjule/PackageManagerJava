package com.company;

import java.util.Scanner;

public class Main {

    static Contact contact = new Contact();
    static Input input = new Input();

    public static void main(String[] args) {
	  contact.updateFirstName(input.getInput("first name"));
	  contact.updateLastName(input.getInput("last name"));
	  contact.updateAddress(input.getInput("address"));
	  contact.updatePhoneNumber(input.getInput("phone number"));
	  System.out.println("First name is: " + contact.FirstName);
	  System.out.println("Last name is: " + contact.LastName);
	  System.out.println("Address is: " + contact.Address);
	  System.out.println("Phone number is: " + contact.PhoneNumber);
    }
}
