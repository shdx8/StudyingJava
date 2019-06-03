package com.gmail.ponomarenko2008.different.collections.consol;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            System.out.println(" -- Make your choice ---");
            MainMenu mainMenu = new MainMenu();
            mainMenu.showMainMenu();

            Integer choice = Integer.parseInt(br.readLine());

            CreateRun createRun = new CreateRun(choice);
            Thread thread = new Thread(createRun);
            try {

                thread.start();
                thread.join();
            } catch (InterruptedException ie) {
                ie.fillInStackTrace();
            }


//            ParserMainMenu parserMainMenu = new ParserMainMenu();
            //          parserMainMenu.parserInteger(choice);


        }


    }
}
