package com.wissen.questions;

public class BinarySearch {
    public static void main(String[] args) {

       int a =  findTheIndexOfNumber(new int[]{1,2,2,2,3,4,4,4,5},0,4,9,3);
        System.out.println("============="+a);
    }

    public static int findTheIndexOfNumber(int[] nums,int left, int middle, int right, int target){
        if(middle<left || middle> right)
            return -1;

        if(nums[middle] == target)
            return middle;
        if(nums[middle] > target)
            return findTheIndexOfNumber(nums,left,(left+middle)/2,middle-1,target);

        else
            return findTheIndexOfNumber(nums,middle+1,(middle+right)/2,right,target);


    }

}
