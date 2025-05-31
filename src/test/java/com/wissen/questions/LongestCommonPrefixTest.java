package com.wissen.questions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {
    private final LongestCommonPrefix solution = new LongestCommonPrefix();

    @Test
    void testLongestCommonPrefix() {
        // Test case with common prefix
        String[] strs1 = {"flower", "flow", "flight"};
        assertEquals("fl", solution.longestCommonPrefix(strs1));

        // Test case with no common prefix
        String[] strs2 = {"dog", "racecar", "car"};
        assertEquals("", solution.longestCommonPrefix(strs2));

        // Test case with single string
        String[] strs3 = {"hello"};
        assertEquals("hello", solution.longestCommonPrefix(strs3));

        // Test case with empty string
        String[] strs4 = {"hello", "", "world"};
        assertEquals("", solution.longestCommonPrefix(strs4));

        // Test case with all identical strings
        String[] strs5 = {"same", "same", "same"};
        assertEquals("same", solution.longestCommonPrefix(strs5));

        // Test case with empty array
        String[] strs6 = {};
        assertEquals("", solution.longestCommonPrefix(strs6));

        // Test case with different lengths
        String[] strs7 = {"hello", "hell", "hel"};
        assertEquals("hel", solution.longestCommonPrefix(strs7));
    }
}
