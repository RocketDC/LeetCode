package com.wissen.questions;

public class StringCompression {
    public static void main(String[] args) {
        compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'});
    }

    public static int compress(char[] chars) {
    int compressedString = 0;
    char ch = chars[0];
    int charCount=1;
    int j=0;

        for (int i = 1; i < chars.length; i++) {
            char currChar = chars[i];
            if(currChar == ch){
                charCount++;
            }
            else{
                chars[j] = ch;
                j++;
                compressedString++;
                if(charCount>1){
                    for (char num : (charCount+"").toCharArray()) {
                        chars[j] = num;
                        j++;
                        compressedString++;
                    }
                }

                ch = chars[i];
                charCount =1;
            }
        }
        if(charCount>=1){
            chars[j] = ch;
            j++;
            compressedString++;
            if(charCount>1){
                for (char num : (charCount+"").toCharArray()) {
                    chars[j] = num;
                    j++;
                    compressedString++;
                }
            }
        }
    return compressedString;
    }
}
