package com.gmail.ponomarenko2008.golovach.generics;

import static java.lang.Math.min;

public class Example_3_1 {

    public static void main(String[] args) {

        testArray();
    }

    private static void testArray() {
        /*
        код сработает пока мисив Интеджеров пуст и массив строк пуст заполнет NULL-ами,
        как только мі в integer[0] ДОБАВИМ КАКОЕ НИБУТЬ ЗНАЧЕНИЕ - КОД НЕ СКАМПИЛИРУЕТСЯ
        Это и есть проблема работи с массивами
         */
        Integer[] integers = new Integer[5];
       // integers[0] = 1;
        String[] strings = new String[5];
        copyArray(integers, strings);
    }
// Перепривели к общему предку
    private static void copyArray(Object[] integers, Object[] strings) {
        int length = min(integers.length, strings.length);
        for (int i = 0; i < length; i++) {
            strings[i] = integers[i];// здесь по сути копируем Object в Object
        }
    }
}
