package com.company;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
    }

    public static String getInput(String detail) {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Please enter your " + detail + ":");
        return getInput.nextLine();
    }
}
