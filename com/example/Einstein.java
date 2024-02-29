package com.example;

import java.util.Scanner;

/**
 * Einstein's equation calculator.
 *
 * @author Spencer S.
 * @version 1.0
 * @since 2024-Feb-26
 */
public final class Einstein {
  /** Stops random instantiation from happening. */
  private Einstein() {
    // Prevents instantiation.
  }

  /**
   * Main Code base.
   *
   * @param args Command line arguments (not used).
   */
  public static void main(final String[] args) {
    // Constants needed later.
    final int cSpeed = 299792458;

    // Opening message.
    System.out.println("Hello this program ");
    System.out.print("calculates Einstein's Equation!");
    System.out.print("Enter the mass of an object");
    System.out.print(" (will be converted to kg): ");
    final Scanner in = new Scanner(System.in);
    final String massString = in.nextLine();
    try {
      // Casts the string to a double for use later.
      final Double massDouble = Double.parseDouble(massString);
      // Checks if the mass is 0 or less than 0.
      if (massDouble <= 0) {
        // Error output message.
        System.out.println("Error detected! ");
        System.out.print("value must be greater than 0!");
      } else {
        // Performs E=MC^2 equation.
        final Double energyNon = massDouble * (Math.pow(cSpeed, 2));
        // Displays outputs.
        // Non rounded output (to cross compare).
        System.out.println("Not rounded input = " + energyNon);
        System.out.print(" J of energy.");
        System.out.println("Rounded value is...");
        // Rounded output.
        System.out.format("%.3f", energyNon);
        System.out.print(" J's.");
      }
    } catch (NumberFormatException error) {
      // Output message for when it's a string input.
      System.out.println("Error detected ");
      System.out.print(massString + " is invalid");
      System.out.print(", only numbers are accepted.");
    }
    // Closes the scanner.
    in.close();
  }
}
