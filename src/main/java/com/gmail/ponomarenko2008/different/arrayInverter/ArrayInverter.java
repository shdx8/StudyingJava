package com.gmail.ponomarenko2008.different.arrayInverter;

import java.util.Arrays;

public class ArrayInverter {

    // Написать код который переворачивает массив
/*
    public static void main(String[] args) {
        int[] i = new int[]{1, 2, 3, 5, 6};
        invert(i);
    }
*/
    public static void invert(int[] arr) {
        System.out.println(Arrays.toString(arr));


        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
