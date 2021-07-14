package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Please enter a number: ");
            sum += scanner.nextInt();
        }
        System.out.println("The average of ten numbers is: " + ((double)sum / (double)10));
    */
        // Alternative way
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many number do you want to enter? ");
        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("The average of " + numbers.length + " numbers is: " + ((double)sum / (double)numbers.length));


    }
}
