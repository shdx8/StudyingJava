package com.gmail.ponomarenko2008.different.array_sort;

import java.util.Arrays;

public class BubbleSortMethod {


    public BubbleSortMethod() {
    }


    // СОРТИРОВКА ПУЗЫРЬКОМ ИЛИ ПУЗЫРЬКОВАЯ СОРТИРОВКА

    public void sort(int[] arr) {
        for (int barrier = arr.length - 1; barrier >= 0; barrier--) {
            System.out.println(Arrays.toString(arr));

            for (int index = 0; index < barrier; index++) {
                if (arr[index] > arr[index + 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }


}
