package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        String name="Malayalam";
        System.out.println(Palindrome(name));


    }


        static String checkifpalindrome(String s, int start, int end) {
            if (start > end) return null;
            while (start >= 0 && end < s.length()
                    && s.charAt(start) == s.charAt(end)) {
                start--;
                end++;
            }
            return s.substring(start + 1, end);
        }


        static String Palindrome(String s) {
            if (s == null) return null;
            String longest = s.substring(0, 1);
            for (int i = 0; i < s.length() - 1; i++) {
                String palindrome = checkifpalindrome(s, i, i);
                if (palindrome.length() > longest.length()) {
                    longest = palindrome;
                }
                palindrome = checkifpalindrome(s, i, i + 1);
                if (palindrome.length() > longest.length()) {
                    longest = palindrome;
                }
            }
            return longest;
        }




    }


