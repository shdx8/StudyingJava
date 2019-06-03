package com.gmail.ponomarenko2008.different.random;

import java.util.LinkedList;

public class RandomUtil {

    private LinkedList<Integer> linkedList = new LinkedList<>();
    private int sizeArray = 10000;

    public RandomUtil() {
    }


    public LinkedList ganereteNamber() {

        for (int i = 0; i < sizeArray; i++) {
            Integer number = (int) (Math.random() * 1000000);
            linkedList.add(number);
        }
        return linkedList;
    }

// ***************option # 1******************************
    // Random random = new Random();
    //   int number = random.nextInt();

// ***************option # 2******************************

}
