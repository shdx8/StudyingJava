package com.gmail.ponomarenko2008.different.array_sort.iteration_recursion_array_sort;

import java.util.Arrays;

public class SelectionSort {
    //Сортировка выборкой или Сортировка Выбором

    public SelectionSort() {
    }

    public void sort(int[] arr) {
        System.out.println("This is selection sort: ");

        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            System.out.println(Arrays.toString(arr));

            for (int index = barrier + 1; index < arr.length; index++) {
                if (arr[barrier] > arr[index]) {
                    int tmp = arr[index];
                    arr[index] = arr[barrier];
                    arr[barrier] = tmp;
                }
            }
//            System.out.println(Arrays.toString(arr));

        }

    }
}
