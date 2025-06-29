package com.wissen.questions;

import java.util.Arrays;

/**
 * Solution for Longest Common Prefix problem
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * <p>
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * <p>
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

        Arrays.sort(strs);
        if(strs.length == 0)
            return "";
        String firstStr = strs[0];
        String lastString = strs[strs.length - 1];
        StringBuilder sb = new StringBuilder();
        String shortestString = firstStr.length() < lastString.length() ? firstStr : lastString;
        for (int i = 0; i < shortestString.length(); i++) {
            char ch = firstStr.charAt(i);
            if (ch != lastString.charAt(i))
                break;
            sb.append(ch);
        }
        return sb.toString();
    }


}
