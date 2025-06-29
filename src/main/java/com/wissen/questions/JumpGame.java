package com.wissen.questions;

public class JumpGame {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{3,2,1,0,4}));
    }

    public static boolean canJump(int[] nums) {
        if(nums.length ==1)
            return true;
        int moveForwardSteps = nums[0];
        int moveForwardTotal = 0;
        int i=1;
        while (moveForwardSteps > 0) {
            moveForwardSteps--;
            moveForwardTotal++;
            if (moveForwardTotal >= nums.length) {
                return true;
            }
            moveForwardSteps = Math.max(nums[i],moveForwardSteps);
            i++;
        }


        return false;
    }
}
