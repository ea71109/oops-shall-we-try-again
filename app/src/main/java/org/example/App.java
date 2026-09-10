package org.example;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int minBound = 1;
    int maxBound = 100;
    String prompt = "Please enter a value: ";
    String errorMessage = "Your value is invalid";

    Oops validator = new Oops();
    int userChoice = validator.validateInput(scanner, minBound, maxBound, prompt, errorMessage);

    System.out.println("The value chosen by the user is " + userChoice);

    int secondMinBound = 50;
    int secondMaxBound = 500;
    String secondPrompt = "Please enter your value: ";
    String secondErrorMessage = "Your value is not valid";

    userChoice = validator.validateInput(scanner, secondMinBound, secondMaxBound, secondPrompt, secondErrorMessage);
    System.out.println("The value chosen by the user is " + userChoice);
    scanner.close();
  }
}
