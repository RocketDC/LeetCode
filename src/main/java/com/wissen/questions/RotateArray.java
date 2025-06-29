package com.wissen.questions;

public class RotateArray {
    public static void main(String[] args) {
//        rotate(new int[] {1,2,3,4,5,6,7}, 3);
        int [] arr = {1,2,3,4,5,6,7};
        int k = 3;
        reverseArr(arr,0, arr.length-1);
        reverseArr(arr,0,k-1);
        reverseArr(arr,k, arr.length-1);
    }


    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] rotatedVals = new int[nums.length];
        System.arraycopy(nums,0,rotatedVals,0,nums.length);
        for (int i = k; i < nums.length; i++) {
            nums[i] = rotatedVals[i-k];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = rotatedVals[nums.length -k +i];
        }

    }

    public static void reverseArr(int[] arr,int start,int end){
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
