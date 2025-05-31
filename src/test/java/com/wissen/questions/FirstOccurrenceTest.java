package com.wissen.questions;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

class FirstOccurrenceTest {
    private final FirstOccurrence solution = new FirstOccurrence();

    @Test
    void testStrStr() {
        // Test case with multiple occurrences
        assertEquals(0, solution.strStr("sadbutsad", "sad"));
        assertEquals(6, solution.strStr("sadbutsad", "sad")); // Test with start index

        // Test case with no occurrence
        assertEquals(-1, solution.strStr("leetcode", "leeto"));

        // Test case with needle at end
        assertEquals(5, solution.strStr("hello", "lo"));

        // Test case with needle at start
        assertEquals(0, solution.strStr("hello", "he"));

        // Test case with needle equal to haystack
        assertEquals(0, solution.strStr("hello", "hello"));

        // Test case with needle longer than haystack
        assertEquals(-1, solution.strStr("hello", "hellothere"));

        // Test case with empty needle
        assertEquals(0, solution.strStr("hello", ""));

        // Test case with empty haystack
        assertEquals(-1, solution.strStr("", "hello"));

        // Test case with single character needle
        assertEquals(0, solution.strStr("a", "a"));
        assertEquals(1, solution.strStr("ab", "b"));
    }
}
