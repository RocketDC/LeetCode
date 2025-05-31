package com.wissen.questions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MajorityElementTest {

    @Test
    public void testExample1() {
        MajorityElement solution = new MajorityElement();
        int[] nums = {3, 2, 3};
        int result = solution.majorityElement(nums);
        Assert.assertEquals(result, 3);
    }

    @Test
    public void testExample2() {
        MajorityElement solution = new MajorityElement();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = solution.majorityElement(nums);
        Assert.assertEquals(result, 2);
    }

    @Test
    public void testSingleElement() {
        MajorityElement solution = new MajorityElement();
        int[] nums = {1};
        int result = solution.majorityElement(nums);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void testWithMultipleMajorityCandidates() {
        MajorityElement solution = new MajorityElement();
        int[] nums = {1, 1, 2, 2, 2, 3, 3, 3, 3};
        int result = solution.majorityElement(nums);
        Assert.assertEquals(result, 3);
    }

    @Test
    public void testLargeArray() {
        MajorityElement solution = new MajorityElement();
        int[] nums = new int[100000];
        // Create an array where 50001 is the majority element
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i < 50001 ? 50001 : i;
        }
        int result = solution.majorityElement(nums);
        Assert.assertEquals(result, 50001);
    }

    @Test
    public void testWithNegativeNumbers() {
        MajorityElement solution = new MajorityElement();
        int[] nums = {-1, -1, 0, 1, 1, 1};
        int result = solution.majorityElement(nums);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void testWithAllSameElements() {
        MajorityElement solution = new MajorityElement();
        int[] nums = {42, 42, 42, 42, 42};
        int result = solution.majorityElement(nums);
        Assert.assertEquals(result, 42);
    }

    @Test
    public void testWithAlternatingElements() {
        MajorityElement solution = new MajorityElement();
        int[] nums = {1, 2, 1, 2, 1};
        int result = solution.majorityElement(nums);
        Assert.assertEquals(result, 1);
    }
}
