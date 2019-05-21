package com.gmail.ponomarenko2008.golovach.thread.Lesson_Multithreading.company.MyClasses;

public class MyClassTwo {

    public void doubleArrey() {
        int[][] array = new int[][]{{1, 2, 3, 4, 5}, {10, 20, 30, 40, 50}};
        for (int j = 0; j < array.length-1; j++) {
            System.out.print(array[j]);
            for (int k = 0; k < array[j].length-1; k++) {
                System.out.print(array[k]);
            }
            System.out.println();
        }
    }
}
