package com.wissen.questions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {
    private final ValidPalindrome solution = new ValidPalindrome();

    @Test
    void testIsPalindrome() {
        // Test palindrome cases
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
        assertTrue(solution.isPalindrome("race car"));
        assertTrue(solution.isPalindrome("."));
        assertTrue(solution.isPalindrome(""));
//        assertTrue(solution.isPalindrome("0P"));

        // Test non-palindrome cases
        assertFalse(solution.isPalindrome("race a car"));
        assertFalse(solution.isPalindrome("hello"));
        assertFalse(solution.isPalindrome("123"));

        // Test cases with special characters
        assertTrue(solution.isPalindrome("Able was I ere I saw Elba"));
        assertTrue(solution.isPalindrome("Madam, in Eden, I'm Adam"));
        assertTrue(solution.isPalindrome("Mr. Owl ate my metal worm"));

        // Test cases with numbers
        assertTrue(solution.isPalindrome("12321"));
        assertTrue(solution.isPalindrome("123454321"));
        assertFalse(solution.isPalindrome("123456"));

        // Test cases with mixed case
        assertTrue(solution.isPalindrome("AbBa"));
        assertTrue(solution.isPalindrome("aBbA"));
        assertFalse(solution.isPalindrome("AbCd"));
    }
}
