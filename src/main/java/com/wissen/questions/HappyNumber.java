package com.wissen.questions;

import  java.util.HashMap;
import java.util.Map;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        while (!map.containsKey(n)){

            char[] digits = Integer.toString(n).toCharArray();
            int currNum = 0;
            for (char digit : digits) {

                currNum += (int) Math.pow(digit - '0', 2);
            }
            map.put(n,currNum);
            n = currNum;


        }
        return n==1;
    }
}
