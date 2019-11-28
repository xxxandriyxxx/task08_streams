package com.epam.pattern_command.View;

import com.epam.pattern_command.controller.Controller;
import com.epam.pattern_command.controller.ControllerImpl;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class View {

    private Controller controller;
    private Map<String, String> menu;
    private Map<String, Printable> methodsMenu;
    private static Scanner input = new Scanner(System.in);

    public View() {
        controller = new ControllerImpl();
        menu = new LinkedHashMap<>();
        menu.put("1", " 1 - use a lambda function");
        menu.put("2", " 2 - use a method reference");
        menu.put("3", " 3 - use an anonymous class");
        menu.put("4", " 4 - use an object of command class");
        menu.put("Q", " q - exit");
        methodsMenu = new LinkedHashMap<>();
        methodsMenu.put("1", this::pressButton1);
        methodsMenu.put("2", this::pressButton2);
        methodsMenu.put("3", this::pressButton3);
        methodsMenu.put("4", this::pressButton4);
    }

    private void pressButton1() {
        controller.lambdaCommand(getMessage());
    }

    private void pressButton2() {
        controller.methodReferenceCommand(getMessage());
    }

    private void pressButton3() {
        controller.anonymousClassCommand(getMessage());
    }

    private void pressButton4() {
        controller.objectCommand(getMessage());
    }

    private String getMessage() {
        System.out.println("Enter a message:");
        return input.nextLine();
    }


    private void outputMenu() {
        System.out.println("\n==================== MENU ====================" +
                "\nSelect how to print the line message:");
        for (String str : menu.values()) {
            System.out.println(str);
        }
    }

    public void show() {
        String keyMenu;
        do {
            outputMenu();
            System.out.println("----------------------------------------------");
            System.out.println("Enter the menu point:");
            keyMenu = input.nextLine().toUpperCase();
            try {
                methodsMenu.get(keyMenu).print();
            } catch (Exception e) {
            }
        } while (!keyMenu.equals("Q"));
    }
}
