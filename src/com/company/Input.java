package com.company;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
    }

    public static String confirmInput(String detail) {
        return getInput(detail);
    }

    public static Integer menuChoice() {
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static String getInput(String detail) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your " + detail + ":");
        String input = userInput.nextLine();
        return input;
    }
}