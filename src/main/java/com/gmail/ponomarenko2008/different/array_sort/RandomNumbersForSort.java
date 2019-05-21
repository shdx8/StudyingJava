package com.gmail.ponomarenko2008.different.array_sort;

import com.gmail.ponomarenko2008.different.array_sort.iteration_recursion_array_sort.BubbleSort;
import com.gmail.ponomarenko2008.different.array_sort.iteration_recursion_array_sort.InsertionSort;
import com.gmail.ponomarenko2008.different.array_sort.iteration_recursion_array_sort.MergeSort;
import com.gmail.ponomarenko2008.different.array_sort.iteration_recursion_array_sort.SelectionSort;

import java.util.Arrays;
import java.util.Random;

public class RandomNumbersForSort {

    private static int[] arr = new int[10];
    private static BubbleSort bubbleSort = new BubbleSort();
    private static MergeSort ms = new MergeSort();
    private static SelectionSort selectionSort = new SelectionSort();
    private static InsertionSort insertionSort = new InsertionSort();


    public static void main(String[] args) {

        getMathRandom();
        bubbleSort.sort(arr);

        getMathRandom();
        selectionSort.sort(arr);

        getMathRandom();
        insertionSort.sort(arr);
    }


    public static void getRandom(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
            //System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));

    }

    private static void getMathRandom() {

        for (int j = 0; j < arr.length; j++) {
            int number = (int) (Math.random() * 1000);
            arr[j] = number;
        }
        System.out.println("Random  " + Arrays.toString(arr));

    }


}
