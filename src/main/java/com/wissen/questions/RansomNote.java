package com.wissen.questions;

public class RansomNote {
    /**
     * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
     * 
     * Each letter in magazine can only be used once in ransomNote.
     * 
     * Example 1:
     * 
     * Input: ransomNote = "a", magazine = "b"
     * Output: false
     * Example 2:
     * 
     * Input: ransomNote = "aa", magazine = "ab"
     * Output: false
     * Example 3:
     * 
     * Input: ransomNote = "aa", magazine = "aab"
     * Output: true
     * 
     * Constraints:
     * 
     * 1 <= ransomNote.length, magazine.length <= 10^5
     * ransomNote and magazine consist of lowercase English letters.
     */
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] magazineChars = new int[26];
        char [] ransomNoteChars = ransomNote.toCharArray();
        for (int i = 0; i < magazine.length(); i++) {
            magazineChars[magazine.charAt(i) - 'a']++;
        }
        for (char ch: ransomNoteChars) {
            if(magazineChars[ch -'a'] <=0)
                return false;
            magazineChars[ch -'a']--;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
