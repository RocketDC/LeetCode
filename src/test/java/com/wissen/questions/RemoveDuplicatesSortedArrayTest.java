package com.wissen.questions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveDuplicatesSortedArrayTest {

    @Test
    public void testExample1() {
        RemoveDuplicatesSortedArray solution = new RemoveDuplicatesSortedArray();
        int[] nums = {1, 1, 2};
        int k = solution.removeDuplicates(nums);
        Assert.assertEquals(k, 2);
        Assert.assertEquals(java.util.Arrays.copyOf(nums, k), new int[]{1, 2});
    }

    @Test
    public void testExample2() {
        RemoveDuplicatesSortedArray solution = new RemoveDuplicatesSortedArray();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = solution.removeDuplicates(nums);
        Assert.assertEquals(k, 5);
        Assert.assertEquals(java.util.Arrays.copyOf(nums, k), new int[]{0, 1, 2, 3, 4});
    }

    @Test
    public void testSingleElement() {
        RemoveDuplicatesSortedArray solution = new RemoveDuplicatesSortedArray();
        int[] nums = {1};
        int k = solution.removeDuplicates(nums);
        Assert.assertEquals(k, 1);
        Assert.assertEquals(java.util.Arrays.copyOf(nums, k), new int[]{1});
    }

    @Test
    public void testAllUniqueElements() {
        RemoveDuplicatesSortedArray solution = new RemoveDuplicatesSortedArray();
        int[] nums = {1, 2, 3, 4, 5};
        int k = solution.removeDuplicates(nums);
        Assert.assertEquals(k, 5);
        Assert.assertEquals(java.util.Arrays.copyOf(nums, k), new int[]{1, 2, 3, 4, 5});
    }

    @Test
    public void testAllSameElements() {
        RemoveDuplicatesSortedArray solution = new RemoveDuplicatesSortedArray();
        int[] nums = {1, 1, 1, 1, 1};
        int k = solution.removeDuplicates(nums);
        Assert.assertEquals(k, 1);
        Assert.assertEquals(java.util.Arrays.copyOf(nums, k), new int[]{1});
    }

    @Test
    public void testNegativeNumbers() {
        RemoveDuplicatesSortedArray solution = new RemoveDuplicatesSortedArray();
        int[] nums = {-2, -2, -1, 0, 0, 1, 2};
        int k = solution.removeDuplicates(nums);
        Assert.assertEquals(k, 4);
        Assert.assertEquals(java.util.Arrays.copyOf(nums, k), new int[]{-2, -1, 0, 1, 2});
    }

    @Test
    public void testLargeArray() {
        RemoveDuplicatesSortedArray solution = new RemoveDuplicatesSortedArray();
        int[] nums = new int[30000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i / 10; // Create duplicates
        }
        int k = solution.removeDuplicates(nums);
        Assert.assertEquals(k, 3000);
        for (int i = 0; i < k; i++) {
            Assert.assertEquals(nums[i], i);
        }
    }
}
