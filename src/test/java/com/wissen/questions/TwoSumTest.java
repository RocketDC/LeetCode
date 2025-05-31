package com.wissen.questions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TwoSumTest {
    
    @Test
    public void testTwoSum() {
        TwoSum twoSum = new TwoSum();
        
        // Test case 1: Normal case
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum.twoSum(nums1, target1);
        Assert.assertEquals(result1, new int[]{0, 1});
        
        // Test case 2: Different order
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum.twoSum(nums2, target2);
        Assert.assertEquals(result2, new int[]{1, 2});
        
        // Test case 3: Negative numbers
        int[] nums3 = {-1, -2, -3, -4, -5};
        int target3 = -8;
        int[] result3 = twoSum.twoSum(nums3, target3);
        Assert.assertEquals(result3, new int[]{2, 4});
    }
}
