package com.gmail.ponomarenko2008.different.array_sort.iteration_recursion_array_sort;

import java.util.Arrays;

public class BubbleSort {

    public BubbleSort() {
    }

    // СОРТИРОВКА ПУЗЫРЬКОМ ИЛИ ПУЗЫРЬКОВАЯ СОРТИРОВКА

    // используется в основном в учебных целях
    // скорость работы N(в квадрате)

    // делая итерации перемещаем наибольшый елемент в конец массива

    public void sort(int[] arr) {
        System.out.println("This is bubble sort");

        for (int barrier = arr.length - 1; barrier >= 0; barrier--) {
            System.out.println(Arrays.toString(arr));

            for (int index = 0; index < barrier; index++) {
                if (arr[index] > arr[index + 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = tmp;
                }
            }
           // System.out.println(Arrays.toString(arr));
        }
    }

}
