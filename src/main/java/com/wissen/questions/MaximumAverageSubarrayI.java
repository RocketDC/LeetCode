package com.wissen.questions;

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        int [] nums = {0,4,0,3,2};
        int k =1;
        System.out.println(findMaxAverage(nums,k) );
    }

    public static double findMaxAverage(int[] nums, int k) {

        int i =0;
        double maxAvg =0.0;
        for(;i<k;i++){
            maxAvg += nums[i];
        }
        double currAvg = maxAvg;
        for (int j = 0; i < nums.length; j++,i++) {
            currAvg = currAvg -nums[j] + nums[i];
            maxAvg = Math.max(maxAvg,currAvg);

        }
        return maxAvg/k;
    }
}
