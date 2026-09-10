package org.example;
import java.util.Scanner;

public class Oops {
  public int validateInput(Scanner scanner, int min, int max, String prompt, String errorMessage)
  {
    int input = 0;
    boolean isValid = false;

    while(!isValid)
    {
      System.out.println(prompt);

      if (scanner.hasNextInt())
      {
        input = scanner.nextInt();

        if (input >= min && input <= max)
        {
          isValid = true;
        }
        else
        {
          System.out.println(errorMessage);
        }
      }
      else
      {
        System.out.println(errorMessage);
        scanner.next();
      }
    }
    return input;
  }
}
