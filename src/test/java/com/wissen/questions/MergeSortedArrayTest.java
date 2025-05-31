package com.wissen.questions;

import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class MergeSortedArrayTest {

    @Test
    public void testMergeExample1() {
        MergeSortedArray solution = new MergeSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        solution.merge(nums1, m, nums2, n);
        Assert.assertEquals(nums1, new int[]{1, 2, 2, 3, 5, 6});
    }

    @Test
    public void testMergeExample2() {
        MergeSortedArray solution = new MergeSortedArray();
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        solution.merge(nums1, m, nums2, n);
        Assert.assertEquals(nums1, new int[]{1});
    }

    @Test
    public void testMergeExample3() {
        MergeSortedArray solution = new MergeSortedArray();
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        solution.merge(nums1, m, nums2, n);
        Assert.assertEquals(nums1, new int[]{1});
    }

    @Test
    public void testMergeWithEmptyArrays() {
        MergeSortedArray solution = new MergeSortedArray();
        int[] nums1 = {0, 0};
        int m = 0;
        int[] nums2 = {1, 2};
        int n = 2;
        solution.merge(nums1, m, nums2, n);
        Assert.assertEquals(nums1, new int[]{1, 2});
    }

    @Test
    public void testMergeWithAllSameElements() {
        MergeSortedArray solution = new MergeSortedArray();
        int[] nums1 = {1, 1, 1, 0, 0, 0};
        int m = 3;
        int[] nums2 = {1, 1, 1};
        int n = 3;
        solution.merge(nums1, m, nums2, n);
        Assert.assertEquals(nums1, new int[]{1, 1, 1, 1, 1, 1});
    }

    @Test
    public void testMergeWithNegativeNumbers() {
        MergeSortedArray solution = new MergeSortedArray();
        int[] nums1 = {-5, -3, -1, 0, 0, 0};
        int m = 3;
        int[] nums2 = {-4, -2, 0};
        int n = 3;
        solution.merge(nums1, m, nums2, n);
        Assert.assertEquals(nums1, new int[]{-5, -4, -3, -2, -1, 0});
    }
}
