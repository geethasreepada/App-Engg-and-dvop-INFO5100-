package com.company;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class Binary {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 0, 2, 3, 0, 4};
int n=array.length;
        System.out.print("\nOriginal array: \n");
        System.out.println(Arrays.toString(array));

        movingzeroestoend(array);

        System.out.print("\nModified array: \n");
        System.out.println(Arrays.toString(array));

    }

    static void movingzeroestoend(int[] inputarray) {
        int n = inputarray.length;
        int temp;
        int count = 0;
        for (int i = 0; i < n ; i++) {
            if (inputarray[i] != 0) {
                temp = inputarray[count];
                inputarray[count] = inputarray[i];
                inputarray[i] = temp;
                count = count + 1;
            }
        }

    }

    static void array(int[] inputarray, int n) {
        for (int i = 0; i < inputarray.length; i++) {
            System.out.println(inputarray[i]+" ");
        }
    }
}

