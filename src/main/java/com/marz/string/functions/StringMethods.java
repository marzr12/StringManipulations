package com.marz.string.functions;

/** @author Marz */

/*
This Class contains various methods to perform operations on the given string or set of strings
*/
public class StringMethods {

  public StringMethods() {}

  /*
  -- Sample Problem : Implement an algorithm to determine if a string has all unique characters --
  Method name : isUnique
  Function: Determines if the input string contains a unique characters or not
  Function parameters: 's' of type String
  Return type: boolean, returns true if all string characters is unique other wise false
  */
  public boolean isUnique(String s) {

    String temp = "";

    for (int i = 0; i < s.length(); i++) {

      char c = s.charAt(i);

      if (temp.indexOf(c) >= 0) {
        return false;
      } else {
        temp += c;
      }
    }
    return true;
  }

  /*
  -- Sample Problem : Write code to reverse a C-Style String (C-String means that “abcd” is represented as five characters, including the null character.) --
  Method name : reverseString
  Function: Rearrages a String in the reverse order
  Function parameters: 's' of type String
  Return type: String, returns the input String in reverse order.
  */
  public String reverseString(String inputString) {

    // Returns an empty string if input parameter is of length 0
    if (inputString.length() == 0) {
      return "";
    }

    String reverse = "";

    for (int i = inputString.length() - 1; i >= 0; i--) {
      char c = inputString.charAt(i);
      if (c == '\0') {
        continue;
      } else {
        reverse += c;
      }
    }
    return reverse;
  }

  /*
  -- Sample Problem : write code to remove the duplicate characters in a string without using any additional buffer.
      NOTE: One or two additional variables are fine. An extra copy of the array is not --
  Method name : removeDuplicateChars
  Function: Reads the input string and builds a new string without any repeating characters
  Function parameters: 'inputString' of type String
  Return type: String, returns the input String without any duplicate characters.
  */
  public String removeDuplicateChars(String inputString) {

    // Returns an empty string if input parameter is of length 0
    if (inputString.length() == 0) {
      return "";
    }

    String uniqueString = "";
    for (int i = 0; i < inputString.length(); i++) {
      char c = inputString.charAt(i);
      if (uniqueString.indexOf(c) >= 0) {
        continue;
      } else {
        uniqueString += c;
      }
    }
    return uniqueString;
  }

  /*
  -- Sample Write a method to decide if two strings are anagrams or not. --
  Method name : isAnagram
  Function: Compares the two input Strings to check if all characters match
  Function parameters: 'inputString' & 'angramString' of type String
  Return type: Boolean, returns true if the input strings are anagrams otherwise returns false.
  */
  public boolean isAnagram(String inputString, String angramString) {

    // Compares if input parameters inputString & angramString are of equal length and not empty
    if ((inputString.length() == angramString.length())
        && (inputString.length() > 0)
        && (angramString.length() > 0)) {

      for (int i = 0; i < inputString.length(); i++) {

        // checks if a character of the first string 's1' exists in the second string 's2'
        int index = angramString.indexOf(inputString.charAt(i));
        if (index != -1) {
          angramString =
              angramString.substring(0, index)
                  + angramString.substring(index + 1, angramString.length());
        } else {
          return false;
        }
      }

      return true;
    }
    return false;
  }

  /*
  -- Sample Write a method to decide if a string is palindrome or not --
  Method name : isPalindrome
  Function: iterates the string by converginging from the start and the end and compares the string characters
  Function parameters: 'inputString' of type String
  Return type: Boolean, returns true if the input strings are anagrams otherwise returns false.
  */
  public boolean isPalindrome(String inputString) {

    // Returns false input parameter is of length 0
    if (inputString.length() == 0) {
      return false;
    }

    boolean isPalindrome = true;
    for (int i = 0, j = inputString.length() - 1; i < inputString.length(); i++, j--) {

      if (inputString.charAt(i) != inputString.charAt(j)) {
        isPalindrome = false;
      }

      if (i >= j) {
        break;
      }
    }
    return isPalindrome;
  }
}
