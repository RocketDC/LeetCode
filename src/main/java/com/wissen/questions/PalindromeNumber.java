package com.wissen.questions;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        x = Math.abs(x);
        char[] digits =  Integer.toString(x).toCharArray();

        int i=0,j=digits.length-1;
        while (i<j){
            if(digits[i]!=digits[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
