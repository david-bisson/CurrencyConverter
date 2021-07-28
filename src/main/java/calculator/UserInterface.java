package calculator;

import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);

    public int getUserChoice() {
        System.out.println("Please choose an option (1/2/3):");
        System.out.println("1. Dollars to Shekels");
        System.out.println("2. Shekels to Dollars");
        System.out.println("3. Shekels to EURO");
        return scanner.nextInt();
    }


    public void printWelcome() {
        System.out.println("Welcome to currency converter");
    }

    public double getAmount() {
        System.out.println("Please enter an amount to convert");
        double amount = scanner.nextDouble();
        return amount;
    }

    public String startOverUSerChoice() {
        String startOver;
        System.out.println("Do you wish to start over Y/N?");
        startOver = scanner.next();
        return startOver;
    }

    public void thanksMessage() {
        System.out.println("Thanks for using our currency converter");
    }
}
