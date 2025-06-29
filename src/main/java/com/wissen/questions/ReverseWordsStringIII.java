package com.wissen.questions;

import java.util.Arrays;

public class ReverseWordsStringIII {
    public static void main(String[] args) {
        char [] css =  { 'a','b',' ','c',' ',' ',' ',' ',' '};
        System.out.println(new String(css).length());
    }


    public static String reverseWords(String s) {
        String[] str = s.split("\\s");
        StringBuilder sb = new StringBuilder();
        for (String string : str) {
            sb.append(reverseString(string)).append(' ');

        }
        return sb.toString().trim();
    }

    public static String reverseString(String str) {
        char[]chars = str.toCharArray();
        int i = 0,j = chars.length-1;
        while (i < j) {
            char tempCh = chars[i];
            chars[i] = chars[j];
            chars[j] = tempCh;
            i++;
            j--;

        }
        return new String(chars);
    }
}
