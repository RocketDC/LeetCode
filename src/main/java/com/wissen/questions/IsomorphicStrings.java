package com.wissen.questions;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    /**
     * Given two strings s and t, determine if they are isomorphic.
     * <p>
     * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
     * <p>
     * All occurrences of a character must be replaced with another character while preserving the order of characters.
     * No two characters may map to the same character, but a character may map to itself.
     * <p>
     * Example 1:
     * <p>
     * Input: s = "egg", t = "add"
     * Output: true
     * <p>
     * Example 2:
     * <p>
     * Input: s = "foo", t = "bar"
     * Output: false
     * <p>
     * Example 3:
     * <p>
     * Input: s = "paper", t = "title"
     * Output: true
     * <p>
     * Constraints:
     * <p>
     * 1 <= s.length <= 5 * 10^4
     * t.length == s.length
     * s and t consist of any valid ascii character.
     */
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        Map<Character,Character> sMap = new HashMap<>();
        Map<Character,Character> tMap = new HashMap<>();
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        for (int i = 0; i < sChar.length; i++) {
            if(sMap.containsKey(sChar[i])&&sMap.get(sChar[i])!=tChar[i]||tMap.containsKey(tChar[i])&&tMap.get(tChar[i])!=sChar[i])
                return false;
            sMap.put(sChar[i],tChar[i]);
            tMap.put(tChar[i],sChar[i]);
        }
        return true;

    }
}
