package com.marz.string.main;

import com.marz.string.functions.StringMethods;

public class StringRun {

  /** @param args the command line arguments */
  public static void main(String[] args) {

    // Instantiating the StringMethods class
    StringMethods stringMethods = new StringMethods();

    //        Below please provide the method parameters and call the desired function.
    //        An example of the 'isPalindrome' is shown
    String palindromeStr = "MADAM";

    boolean isPalindromeStr = stringMethods.isPalindrome(palindromeStr);

    System.out.println("---- Result =  " + isPalindromeStr + " ----");
  }
}
