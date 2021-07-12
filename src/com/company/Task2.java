package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Please enter number: ");
            sum += scanner.nextInt();
        }
        System.out.println("The average is: " + ((double)sum / (double)10));
    }
}
