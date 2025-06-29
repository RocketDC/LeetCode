package com.wissen.questions;

public class JumpGameII {
    public static void main(String[] args) {
        System.out.println(jump(new int[]{2,3,0,1,4}));
    }
    public static int jump(int[] nums) {
        if (nums.length ==1)
            return 0;

        int minNoJumps = 0;
        int biggestNum = 0;
        int moveForwardSteps = nums[0];
        int i = 1;
        while (i< nums.length){
            moveForwardSteps--;
            if(nums[i]-moveForwardSteps>biggestNum){
                biggestNum = nums[i]-moveForwardSteps;
            }
            if(moveForwardSteps == 0){
                moveForwardSteps = biggestNum;
                minNoJumps++;
                biggestNum = 0;
            }
            i++;
        }
        return minNoJumps;
    }
}
