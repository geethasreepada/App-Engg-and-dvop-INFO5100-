package com.company;

import org.w3c.dom.css.Counter;

public class Index {
    public static void main(String[] args) {
        String name = "Geetha";
        int index = firstnonrepeatingcharacterindex(name);
        System.out.println(index);
    }

    static int firstnonrepeatingcharacterindex(String name) {
        getCharCount(name);

        for (int i = 0; i < name.length() - 1; i++) {


            if (count[name.charAt(i)] == 1) {

                return i;

            }
        }
        return -1;
    }
       static final int NO_OF_CHARS = 256;
       static char count[] = new char[NO_OF_CHARS];

        static void getCharCount(String name)
        {
            for (int i = 0; i < name.length();  i++)
                count[name.charAt(i)]++;
        } }








