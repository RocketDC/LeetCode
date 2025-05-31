package com.wissen.questions;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

/**
 * Test class for LengthOfLastWord
 */
public class LengthOfLastWordTest {
    
    private final LengthOfLastWord solution = new LengthOfLastWord();
    
    @Test
    public void testLengthOfLastWord() {
        // Test case 1: Basic case
        assertEquals(5, solution.lengthOfLastWord("Hello World"), "Basic case failed");
        
        // Test case 2: Multiple spaces
        assertEquals(4, solution.lengthOfLastWord("   fly me   to   the moon  "), "Multiple spaces case failed");
        
        // Test case 3: Single word
        assertEquals(5, solution.lengthOfLastWord("hello"), "Single word case failed");
        
        // Test case 4: Empty string
        assertEquals(0, solution.lengthOfLastWord(""), "Empty string case failed");
        
        // Test case 5: String with only spaces
        assertEquals(0, solution.lengthOfLastWord("   "), "Only spaces case failed");
        
        // Test case 6: Single letter
        assertEquals(1, solution.lengthOfLastWord("a"), "Single letter case failed");
        
        // Test case 7: Long string
        assertEquals(6, solution.lengthOfLastWord("luffy is still joyboy"), "Long string case failed");
        
        // Test case 8: Special characters
        assertEquals(5, solution.lengthOfLastWord("Hello World!"), "Special characters case failed");
    }
}
