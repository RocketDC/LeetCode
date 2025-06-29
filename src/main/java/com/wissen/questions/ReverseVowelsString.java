package com.wissen.questions;

import java.util.Stack;

public class ReverseVowelsString {
    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
    }

    public static String reverseVowels(String s) {

        Stack<Character> chs = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                chs.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                sb.append(chs.pop());
                continue;
            }
            sb.append(ch);
        }

        return sb.toString();
    }

    public static boolean isVowel(char ch) {
        int[] vowels = {0, 'e' - 'a', 'i' - 'a', 'o' - 'a', 'u' - 'a'};
        for (int i : vowels) {
            if ((Character.toLowerCase(ch) - 'a') == i)
                return true;
        }
        return false;
    }
}
