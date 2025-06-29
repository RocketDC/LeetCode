package com.wissen.questions;

public class ReverseWordsString {
    public static void main(String[] args) {
        reverseWords("a good   example");
    }

    public static String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();
        boolean isSpace = false;
        for (int i = s.length()-1; i >=0 ; i--) {
            char ch = s.charAt(i);

            if(ch == ' '){
                isSpace = true;
            }else {
                if(isSpace){
                    sb.append(' ');
                    isSpace = false;
                }
                sb.append(ch);
            }

        }
        return sb.toString().trim();
    }
}
