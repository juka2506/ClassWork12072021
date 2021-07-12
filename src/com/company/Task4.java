package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
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
        System.out.println(maximum);
    }
}
