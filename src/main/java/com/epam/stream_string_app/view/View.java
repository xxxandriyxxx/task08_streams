package com.epam.stream_string_app.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class View {


    public static void main(String[] args) {

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
    }


}
