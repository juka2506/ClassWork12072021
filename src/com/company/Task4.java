package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter? ");
        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter number: ");
            numbers[i] = scanner.nextInt();
        }
        int maximum = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }
        System.out.println("The maximum is: " + maximum);
    }
}
