package com.wissen.questions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveElementTest {

    @Test
    public void testExample1() {
        RemoveElement solution = new RemoveElement();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int k = solution.removeElement(nums, val);
        Assert.assertEquals(k, 2);
        Assert.assertTrue(nums[0] == 2 || nums[1] == 2);
        Assert.assertTrue(nums[0] == 2 || nums[1] == 2);
    }

    @Test
    public void testExample2() {
        RemoveElement solution = new RemoveElement();
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int k = solution.removeElement(nums, val);
        Assert.assertEquals(k, 5);
        int[] expected = {0, 1, 3, 0, 4};
        java.util.Arrays.sort(nums, 0, k);
        java.util.Arrays.sort(expected);
        Assert.assertEquals(java.util.Arrays.copyOf(nums, k), expected);
    }

    @Test
    public void testEmptyArray() {
        RemoveElement solution = new RemoveElement();
        int[] nums = {};
        int val = 1;
        int k = solution.removeElement(nums, val);
        Assert.assertEquals(k, 0);
    }

    @Test
    public void testAllElementsToRemove() {
        RemoveElement solution = new RemoveElement();
        int[] nums = {1, 1, 1, 1};
        int val = 1;
        int k = solution.removeElement(nums, val);
        Assert.assertEquals(k, 0);
    }

    @Test
    public void testNoElementsToRemove() {
        RemoveElement solution = new RemoveElement();
        int[] nums = {1, 2, 3, 4};
        int val = 5;
        int k = solution.removeElement(nums, val);
        Assert.assertEquals(k, 4);
        Assert.assertEquals(java.util.Arrays.copyOf(nums, k), new int[]{1, 2, 3, 4});
    }

    @Test
    public void testSingleElement() {
        RemoveElement solution = new RemoveElement();
        int[] nums = {1};
        int val = 1;
        int k = solution.removeElement(nums, val);
        Assert.assertEquals(k, 0);
    }
}
