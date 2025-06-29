package com.wissen.questions;

public class ProductArrayExceptSelf {


    public int[] productExceptSelf(int[] nums) {
        int[] leftMultiple = new int[nums.length];
        int[] rightMultiple = new int[nums.length];
        int currMultple = 1;
        for (int i = 0; i < nums.length; i++) {
            leftMultiple[i]  = currMultple;
            currMultple *= nums[i];
        }
        currMultple =1;
        for (int i = nums.length -1;i>=0;i --){

            rightMultiple[i] = currMultple;
            currMultple *= nums[i];
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = leftMultiple[i] * rightMultiple[i];

        }
        return result;
    }
}
