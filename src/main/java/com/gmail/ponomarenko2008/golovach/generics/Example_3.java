package com.gmail.ponomarenko2008.golovach.generics;

import java.util.ArrayList;

public class Example_3 {
    public static void main(String[] args) {
        /*
        Пример № 1
         */
        // C массивами основная проблема что код который кампилируется может сламаться в момент выполнения !!!!!!!!!!!!
        // В Generics эту проблему решили, если код кампилируется он не сламается в момент выполнения
/*
Код сламается в момент выполения а не кампиляции
из за того что в наследовании можно превисти наследника к предку а Integer является нследником Object
то мы туда можем записать СТРОКУ , потому что строка "Hello" String тоже наследник Object
поетому кампилятор пропустит, но сламается в процесе виполнения программы что есть очень плохо

а ето потому что массивы КОВАРИАНТНЫ, то есть могут превистись к предку, а в Generics эта ошибка исправлена
  */
        Object[] ref = new Integer[5];
        ref[0] = "Hello";


        /*
        Пример № 2
         */
        // Код сламается в процесе кампиляци, потому что в Generics строгая типизация
        //если объявил как Object ArrayList<Object> ref2 то и здесь должен быть Object а не Integer  new ArrayList<Integer>()
        // ArrayList<Object> ref2 = new ArrayList<Integer>();

        // Пример № 3 работает
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        // Пример № 4
        ArrayList<? extends Integer> re = new ArrayList<Integer>();
        // Это ArrayList непонятно чего, и  будем засовывать непонятно что но  от предка Integer и , ниже, до его потомков


        //Пример № 5
        // В даном примере добавить невозможно
        // но получить и превисти к предку можно
        // Добавить нет возможности так как знак ? говорит что немонятно что добавлять будем
        ArrayList<? extends Object> objects = new ArrayList<Integer>();

        //objects.add(1);
        Object objects2 = objects.get(0);

        // ПРимер № 6
        ArrayList<? super Integer> ref3 = new ArrayList<Integer>();
        //Добавить можно но витянуть, забрать нет
        ref3.add(123);
        Object i = ref3.get(0);
    }

}
