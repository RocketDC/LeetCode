package com.wissen.questions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MirrorPersonalityFightTest {
    /*
    * Idea Followed is to create a int array for characters and then multiply the peoples
    * */
    
    @Test
    public void testCalculateFights() {
        MirrorPersonalityFight fight = new MirrorPersonalityFight();

        // Test case 1: Basic single mirror pair
        Assert.assertEquals(1, fight.calculateFights("abcz"));   // a-z

// Test case 2: One mirror pair (b-y)
        Assert.assertEquals(1, fight.calculateFights("abcy"));

// Test case 3: No mirror pairs
        Assert.assertEquals(0, fight.calculateFights("abcd"));

// Test case 4: Empty string
        Assert.assertEquals(0, fight.calculateFights(""));

// Test case 5: All mirror pair (a-z)
        Assert.assertEquals(1, fight.calculateFights("az"));

// Test case 6: Repeated characters – two a’s with one z  → 2 pairs
        Assert.assertEquals(2, fight.calculateFights("abaz"));
        Assert.assertEquals(2, fight.calculateFights("aaz"));
        Assert.assertEquals(1, fight.calculateFights("wjlahohpec"));

    }
}
