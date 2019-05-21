package com.gmail.ponomarenko2008.golovach.generics;

import static java.lang.Math.min;

public class Example_3_2 {
    public static void main(String[] args) {
    }

    private static void testArray() {

        Integer[] integers = new Integer[5];
        // integers[0] = 1;
        String[] strings = new String[5];
        copyArray(integers, strings);
    }


    private static void copyArray(Object[] integers, Object[] strings) {
        int length = min(integers.length, strings.length);
        for (int i = 0; i < length; i++) {
            strings[i] = integers[i];
        }
    }
}
