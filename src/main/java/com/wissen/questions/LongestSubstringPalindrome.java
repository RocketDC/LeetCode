package com.wissen.questions;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringPalindrome {
    public static void main(String[] args) {
        String str = "sadlkdgracar";
        String palindrome = "";
        outer:
        for (int i = 0; i < str.length(); i++) {
            List<String> getSubStrings = getSubstrings(str,str.length() -i);
            for (int j = 0; j < getSubStrings.size(); j++) {
                if(isPalindrome(getSubStrings.get(j))){
                    palindrome =getSubStrings.get(j);
                    break outer;
                }
            }
        }
        System.out.println("Largest Palindrome is =>" + palindrome);
    }

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            char x = str.charAt(i);
            char y = str.charAt(j);
            if (x != y)
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static List<String> getSubstrings(String str, int size){
        List<String > ls = new ArrayList<>();

        for (int i = 0; i+size <= str.length(); i++) {
            ls.add(str.substring(i,i+size));

        }
        System.out.println(ls);
        return ls;
    }
}
