package com.gmail.ponomarenko2008.different.collections.consol;

import java.io.IOException;
import java.sql.SQLException;

public class ParserMainMenu {

    private AddEntityMenu addEntityMenu;
    private CreateRun createRun;



    public ParserMainMenu() {


    }

    public void parserInteger(Integer in) {

        switch (in) {
            case 1:

                addEntityMenu = new AddEntityMenu();
                try {
                    addEntityMenu.showAddEntityMenu();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;


            case 2:

                break;


            case 3:

                break;

            case 4:

                break;
        }

    }

}
