package CodingProblems;

public class Palindrome {

    //Check to see if a number is a CodingProblems.Palindrome

    public static boolean isPalindrome(int x) {
        // Casting x into a String
        String xString = "" + x;
        // Setting an empty string to "reverse" into to compare
        String reverseString = "";

        //If number is negative, immediately return false.
        if (x < 0) {
            return false;
        }


        for (int i = 0; i < xString.length(); i++) {
            // Catching letter
            char ch = xString.charAt(i);
            // Adding into string. Char HAS TO GO FIRST to reverse.
            reverseString = ch + reverseString;
        }
        // Using .equals to compare. Can't use == because Strings are objects.
        if (xString.equals(reverseString)) {
            return true;
        } else {
            return false;
        }
    }
}