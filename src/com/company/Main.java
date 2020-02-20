package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	  System.out.println(0);
	  String FirstName = getInput();
	  System.out.println(FirstName);
    }

    public static String getInput() {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Please enter your first name:");
        String name = getInput.nextLine();
        return name;
    }
}
