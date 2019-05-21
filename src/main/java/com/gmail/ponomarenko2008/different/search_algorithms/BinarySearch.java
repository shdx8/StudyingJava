package com.gmail.ponomarenko2008.different.search_algorithms;

import java.util.Arrays;
import java.util.Scanner;
//https://javadevblog.com/primer-programmy-binarnogo-dvoichnogo-poiska-na-java.html

public class BinarySearch {
    private static int searchNumber = 5;

    public static void main(String[] args) {
        int[] arr;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter size of array");

            int sizeArr = scanner.nextInt();
            arr = new int[sizeArr];

            for (int i = 0; i < arr.length - 1; i++) {
                int num = (int) (Math.random() * 1000);
                arr[i] = num;
            }
            System.out.println(Arrays.toString(arr));
            System.out.println("*************************************************************");
            System.out.println("Enter, tust at keyboard ,if you want find element");
          //  String s = scanner.nextLine();
inscanner.nextInt();
             searchElement(arr, searchNumber);

             scanner.close();

        }
    }


    public static void searchElement(int[] arr, int number) {

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int comparisonCount = 1;
        int first = arr[0];
        int last = arr.length - 1;
        int position = ((first + last) / 2);

        while ((arr[position] != number) && (arr[0] <= (arr.length - 1))) {
            comparisonCount++;

            if (arr[position] > number) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = ((first + last) / 2);

            if (first <= last) {
                System.out.println(number + " является " + ++position + " элементом в массиве");
                System.out.println("Метод бинарного поиска нашел число после " + comparisonCount +
                        " сравнений");
            } else {
                System.out.println("Элемент не найден в массиве. Метод бинарного поиска закончил работу после "
                        + comparisonCount + " сравнений");
            }

        }


        //Самый простой способ
        //  Arrays.binarySearch(arr, number);
    }
}
