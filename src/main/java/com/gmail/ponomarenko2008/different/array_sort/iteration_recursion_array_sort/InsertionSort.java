package com.gmail.ponomarenko2008.different.array_sort.iteration_recursion_array_sort;

import java.util.Arrays;

public class InsertionSort {
    //СОРТИРОВКА ВСТАВКАМИ

    // скорость работы N(в квадрате)

    // используется в основном в учебных целях
//в даной сортировке мы как ба вганяем елемент с права на лево , сравнивая при этом их
    // проганяя елементы с конца в начало массива

    public InsertionSort() {
    }

    // внешний for это движущаяся граница, внутрений While это на сколько надо погрузить елемент
    public void sort(int[] arr) {
        System.out.println("This is insertion sort: ");
        for (int i = 1; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr));

            int newElement = arr[i];
            int location = i - 1;
            while (location >= 0 && arr[location] > newElement) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = newElement;
        }
    }

}
