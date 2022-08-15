package CodingProblems;


// https://leetcode.com/problems/ransom-note/

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        // If there's more words in the note than the magazine, false.
        if(ransomNote.length() > magazine.length()) {
            return false;
        }

        // catching all characters from the ransom note
        char[] ransomArray = ransomNote.toCharArray();


        for (char ransomChar: ransomArray) {
            String ransomCharToCompare = Character.toString(ransomChar);

            // if the magazine string contains the ransom character, remove first instance from magazine
            if(magazine.contains(ransomCharToCompare)) {
                magazine = magazine.replaceFirst(ransomCharToCompare, "");
            }
            // if no match, return false
            else{ return false;}
        }
        //if loop has completed without kicking out false, should be true;

      return true;
    }

    public static void main(String[] args) {
        String test = "abcc";
        String against = "abcd";

        canConstruct(test, against);
    }
}
