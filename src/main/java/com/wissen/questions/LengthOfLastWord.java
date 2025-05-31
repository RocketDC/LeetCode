package com.wissen.questions;

/**
 * Solution for Length of Last Word problem
 * Given a string s consisting of some words separated by some number of spaces,
 * return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 * <p>
 * Example 1:
 * Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5.
 * <p>
 * Example 2:
 * Input: s = "   fly me   to   the moon  "
 * Output: 4
 * Explanation: The last word is "moon" with length 4.
 * <p>
 * Example 3:
 * Input: s = "luffy is still joyboy"
 * Output: 6
 * Explanation: The last word is "joyboy" with length 6.
 * <p>
 * Constraints:
 * 1 <= s.length <= 104
 * s consists of only English letters and spaces ' '.
 */
public class LengthOfLastWord {
    /**
     * Finds the length of the last word in the given string.
     *
     * @param s Input string
     * @return Length of the last word
     */
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;

        for (; i >= 0; i--) {
            if (s.charAt(i) != ' ')
                break;
        }
        int start = i;
        for (; i >= 0; i--) {
            if (s.charAt(i) == ' ')
                break;

        }

        return start - i;
    }


    public int method(String s) {
        String[] words = s.split("\\s");
        if (words.length == 0)
            return 0;
        return words[words.length - 1].length();
    }
}
