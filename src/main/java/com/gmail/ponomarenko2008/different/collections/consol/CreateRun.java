package com.gmail.ponomarenko2008.different.collections.consol;

public class CreateRun implements Runnable {
    private Integer integer;

    public CreateRun() {

    }

    public CreateRun(Integer integer) {
        this.integer = integer;
    }


    @Override
    public void run() {
        ParserMainMenu parserMainMenu = new ParserMainMenu();
        parserMainMenu.parserInteger(integer);
    }
}
