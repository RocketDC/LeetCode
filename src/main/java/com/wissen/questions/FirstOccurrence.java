package com.wissen.questions;

/**
 * Solution for Find the Index of the First Occurrence in a String problem
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 * 
 * Example 1:
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * 
 * Example 2:
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" is not a substring of "leetcode".
 * 
 * Constraints:
 * 1 <= haystack.length, needle.length <= 104
 * haystack and needle consist of only lowercase English letters.
 */
public class FirstOccurrence {
    /**
     * Finds the index of the first occurrence of needle in haystack.
     * 
     * @param haystack The string to search within
     * @param needle The substring to search for
     * @return The index of the first occurrence of needle in haystack, or -1 if not found
     */
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
