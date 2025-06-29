package com.wissen.questions;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("tmmzuxt"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int longestSubstring = 0;
        int currSubString;
        //Character and index map
        Map<Character, Integer> chars = new HashMap<>();
        int i = 0, j = 0;
        while (j < s.length()) {

            char ch = s.charAt(j);
            if (chars.containsKey(ch)) {
                i = Math.max(i, chars.get(ch) + 1);
            }
            currSubString = j - i + 1;
            longestSubstring = Math.max(longestSubstring, currSubString);

            chars.put(ch, j);
            j++;
        }

        return longestSubstring;
    }
}
