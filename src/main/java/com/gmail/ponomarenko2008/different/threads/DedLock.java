package com.gmail.ponomarenko2008.different.threads;

public class DedLock {

// Пример ДэдЛока

    public static void main(String[] args) throws InterruptedException {
// Пример ДэдЛока

       // Кога говорят Дедлок это значит когда Два Потока начинают ждять завершения друг друга

//Вызиваю ссылку на основной поток (на сомого себя)
        //Thread thread = Thread.currentThread();

       // thread.join(); //Происходит зависание программы так как я жду пока я сам же закончусь(завершу поток)

        //********************************
        // Второй пример тоже самое , только запись по другому
         Thread.currentThread().join();

    }
}
