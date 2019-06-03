package com.gmail.ponomarenko2008.different.collections.list.useLinkedList;

import com.gmail.ponomarenko2008.progects.model.LoginUser;
import com.gmail.ponomarenko2008.progects.repository.LoginDao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws IOException, SQLException {

        ExampleLinkedList exampleLinkedList = new ExampleLinkedList();
        LoginUser loginUser;
        LoginDao loginDao;

        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter login: ");
            String login = br.readLine();

            System.out.println("Enter password:");
            String password = br.readLine();

            loginUser = new LoginUser(login, password);

            exampleLinkedList.addLoginUser(loginUser);

            exampleLinkedList.showAllLoginUser();

            System.out.println("Enter id for delete login:");
            Integer id = Integer.parseInt(br.readLine());
            exampleLinkedList.deleteLoginUser(id);
            System.out.println();

        }
    }
}
