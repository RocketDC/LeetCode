package com.wissen.questions;

public class MaximumDifferenceBetweenIncreasingElements {

    public static void main(String[] args) {
        int [] nums = {7,1,5,4};
        System.out.println(maximumDifference(nums));
    }

    public static int maximumDifference(int[] nums) {
        int maxDiff =-1;
        int i=0,j= 0;

        while (j< nums.length){
            if(nums[i]>nums[j]){
                i=j;
            }
            int currentDiff = (nums[j]-nums[i]);
            maxDiff = Math.max(currentDiff,maxDiff);
            j++;
        }

        return maxDiff==0?-1:maxDiff;
    }
}
