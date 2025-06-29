package com.wissen.questions;

import java.util.HashMap;
import java.util.Map;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {-1,-1,0,0,-1,-1};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int[] rightSumArr = new int[nums.length];
        rightSumArr[nums.length - 1]=0;
        int rightSum = 0;
        for (int i = nums.length -2; i >=0; i--) {
            rightSum += nums[i+1];
            rightSumArr[i]=rightSum;

        }

        int leftSum =0;

        for (int i =  0; i < nums.length; i++) {
            if(leftSum == rightSumArr[i]){
                return i ;
            }
            leftSum += nums[i];
        }
        return -1;
    }


    public static int method(int[] nums) {
        int left = 0, right = nums.length - 1;
        int leftSum = 0, rightSum = 0;

        while (right > left) {

            if (leftSum > rightSum) {
                rightSum += nums[right];
                right--;
            } else {
                leftSum += nums[left];
                left++;
            }
            if (leftSum == rightSum) {
                return left;
            }
        }
        return -1;
    }
}
