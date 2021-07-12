package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = null;
        for (int i = 0; i < 5; i++) {
            System.out.print("Please enter string: ");
            if(result == null) {
                result = scanner.next() + " ";
            } else {
                result += scanner.next() + " ";
            }

        }
        System.out.println(result);
    }
}
