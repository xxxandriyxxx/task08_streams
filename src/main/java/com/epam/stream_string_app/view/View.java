package com.epam.stream_string_app.view;

import com.epam.stream_string_app.controller.Controller;
import com.epam.stream_string_app.controller.ControllerImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {

    private Controller controller;

    public View() {
        controller = new ControllerImpl();
    }

    public void show() {
        List<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("-----------------------------------------\n"
                    + "Input a text line (empty line for stop inputting):");
            str = scan.nextLine().trim();
            if (str.equals("")) {
                break;
            } else {
                list.add(str);
                System.out.println("List: " + list.toString());
            }
        }
        System.out.println("-------------------------"
                + "\nList: " + list.toString());
        System.out.print("The number of unique words: "
                + controller.getNumOfUnique(list));
        System.out.print("\nSorted list of unique words: "
                + controller.getSortedListOfUnique(list));
        System.out.print("\nThe number of each word: "
                + controller.getNumOfWords(list));
        System.out.print("\nThe number of each symbol: "
                + controller.getNumOfSymbols(list));
        System.out.println("\n-------------------------");
    }

}
