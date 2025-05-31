package com.wissen.questions;

/**
 * Solution for Longest Common Prefix problem
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * 
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * 
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * 
 * Constraints:
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 */
public class LongestCommonPrefix {
    /**
     * Finds the longest common prefix among an array of strings.
     * 
     * @param strs Array of strings to find common prefix
     * @return Longest common prefix string
     */
    public String longestCommonPrefix(String[] strs) {
        String shortestString =strs[0];
        String longestString=strs[0];
        for (String str : strs) {
            shortestString = (shortestString.length() < str.length()) ? shortestString : str;
            longestString = (longestString.length() < str.length()) ? longestString : str;
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < shortestString.length(); i++) {
            char ch =shortestString.charAt(i);
            if(ch!= longestString.charAt(i))
                break;
            sb.append(ch);
        }
        return sb.toString();
    }


}
