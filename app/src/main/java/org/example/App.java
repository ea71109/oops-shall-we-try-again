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
    int userChoice = validator.ValidateInput(scanner, minBound, maxBound, prompt, errorMessage);

    System.out.println("The value chosen by the user is " + userChoice);
    scanner.close();
  }
}
