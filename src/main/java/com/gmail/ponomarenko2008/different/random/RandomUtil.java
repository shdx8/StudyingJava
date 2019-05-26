package com.gmail.ponomarenko2008.different.random;

import com.gmail.ponomarenko2008.java8.User;

import java.util.Random;

public class RandomUtil {


    private Integer[] arr;
    private int sizeArray;




    // ПЕРЕДЕЛАТЬ





    public RandomUtil() {
    }

    public RandomUtil(Integer[] arr, int sizeArray) {
        this.arr = arr;
        this.sizeArray = sizeArray;

    }

    public Integer[] generateRandomArrayInreger() {
        Random random = new Random();
        for (int i = 0; i < sizeArray; i++) {
            int num = random.nextInt();
            //int newAge = ((num % 1000000000) / 10000000);

        }



            return arr;
        }


    }
