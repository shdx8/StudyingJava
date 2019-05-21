package com.gmail.ponomarenko2008.different.array_sort.iteration_recursion_array_sort;

import java.util.Arrays;

public class MergeSort {

    public MergeSort() {
    }

    public void mergeSort(int[] arr, int left, int right) {
        // Выберем разделитель, т.е. разделим пополам входной массив
        int delimiter = left + ((right - left) / 2) + 1;


        // Выполним рекурсивно данную функцию для двух половинок (если сможем разбить(
        if (delimiter > 0 && right > (left + 1)) {
            mergeSort(arr, left, delimiter - 1);
            mergeSort(arr, delimiter, right);
        }
        // Создаём временный массив с нужным размером
        int[] buffer = new int[right - left + 1];
        // Начиная от указанной левой границы идём по каждому элементу
        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {
            // Мы используем delimeter чтобы указывать на элемент из правой части
            // Если delimeter > right, значит в правой части не осталось недобавленных элементов
            if (delimiter > right || arr[cursor] > arr[delimiter]) {
                buffer[i] = arr[cursor];
                cursor++;
            } else {
                buffer[i] = arr[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, arr, left, buffer.length);
        System.out.println(Arrays.toString(buffer));
    }

}
