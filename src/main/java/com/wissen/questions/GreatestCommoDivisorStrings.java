package com.wissen.questions;

public class GreatestCommoDivisorStrings {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
    }

    public static String gcdOfStrings(String str1, String str2) {

        int a = str1.length();
        int b = str2.length();

        while (b!=0){
            b = a %b ==0 ? b : a%b;
        }


        return  "";
    }


}
