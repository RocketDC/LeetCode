package com.wissen.questions;

public class RemoveDuplicatesSortedArrayII {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,1,2,2,3}));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0, j = 1;
        int maxRepAllowed = 1;
        int k = 1;
        while (j < nums.length) {
            if (nums[i] == nums[j] && maxRepAllowed > 0) {
                k++;
                maxRepAllowed--;
                i++;
                nums[i] = nums[j];
            } else if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
                k++;
                maxRepAllowed =1;
            }
            j++;

        }
        return k;
    }
}
