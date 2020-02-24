package com.company;

public class Main {

    static Contact contact = new Contact();
    static Input input = new Input();

    public static void main(String[] args) {
	  contact.updateFirstName(input.confirmInput("first name"));
	  contact.updateLastName(input.confirmInput("last name"));
	  contact.updateAddress(input.confirmInput("address"));
	  contact.updatePhoneNumber(input.confirmInput("phone number"));
	  contact.updateDOB(input.confirmInput("DOB"));
	  contact.updateEmail(input.confirmInput("email"));
	  System.out.println("First name is: " + contact.FirstName);
	  System.out.println("Last name is: " + contact.LastName);
	  System.out.println("Address is: " + contact.Address);
	  System.out.println("Phone number is: " + contact.PhoneNumber);
	  System.out.println("Date of birth is: " + contact.DOB);
	  System.out.println("Email is: " + contact.Email);
	}
}
