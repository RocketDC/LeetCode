package com.wissen.questions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {
    private final IsSubsequence solution = new IsSubsequence();

    @Test
    void testIsSubsequence() {
        // Test cases where s is a subsequence of t
        assertTrue(solution.isSubsequence("abc", "ahbgdc"));
        assertTrue(solution.isSubsequence("ace", "abcde"));
        assertTrue(solution.isSubsequence("", "abcde")); // Empty string is always a subsequence
        assertTrue(solution.isSubsequence("a", "abcde"));
        assertTrue(solution.isSubsequence("ae", "abcde"));

        // Test cases where s is not a subsequence of t
        assertFalse(solution.isSubsequence("axc", "ahbgdc"));
        assertFalse(solution.isSubsequence("aec", "abcde"));
        assertFalse(solution.isSubsequence("abc", "ab"));
        assertFalse(solution.isSubsequence("abc", "ac"));

        // Test cases with repeated characters
        assertTrue(solution.isSubsequence("aa", "aaab"));
        assertTrue(solution.isSubsequence("aab", "aaab"));
        assertFalse(solution.isSubsequence("aba", "aaab"));

        // Test cases with edge cases
        assertTrue(solution.isSubsequence("", "")); // Both empty strings
        assertFalse(solution.isSubsequence("a", "")); // Non-empty string with empty main string
        assertTrue(solution.isSubsequence("", "a")); // Empty string with non-empty main string

        // Test cases with large strings
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 50; i++) {
            sb.append('a');
        }
        assertTrue(solution.isSubsequence("a", sb.toString()));
        assertFalse(solution.isSubsequence("b", sb.toString()));
    }
}
