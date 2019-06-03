package com.gmail.ponomarenko2008.different.collections.consol;

public class MainMenu {

    public MainMenu() {
    }


    public void showMainMenu() {
        System.out.println("1." + ListMenuEnum.ADD);
        System.out.println("2." + ListMenuEnum.DELETE);
        System.out.println("3." + ListMenuEnum.SHOW_ALL);
        System.out.println("4." + ListMenuEnum.FIND_FROM_CRITERIY);

    }
}
