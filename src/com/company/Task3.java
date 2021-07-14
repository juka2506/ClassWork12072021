package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many Strings do you want to enter? ");
        int numberOfStrings = scanner.nextInt();
        String result = "";
        /*for (int i = 0; i < numberOfStrings; i++) {
            System.out.print("Please enter string: ");
            result += scanner.next() + " ";
        }*/

        //Alternative way
        String[] strings = new String[numberOfStrings];
        for (int i = 0; i < strings.length; i++) {
            System.out.print("Please enter string: ");
            strings[i] += scanner.next();
        }
        for (int i = 0; i < strings.length; i++) {
            result += strings[i] + " ";
        }

        System.out.println(result);
    }
}
