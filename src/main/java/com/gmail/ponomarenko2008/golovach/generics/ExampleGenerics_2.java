package com.gmail.ponomarenko2008.golovach.generics;

public class ExampleGenerics_2<T> {
   private T data;

    public ExampleGenerics_2(T data) {
        this.data = data;
    }

    public T getData() {

        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
