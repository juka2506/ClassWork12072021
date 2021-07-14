package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter how many numbers you want: ");
        int[] numbers = new int[scanner.nextInt()];
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
            if(numbers[i] % 2 != 0) {
                count++;
            }
        }
        //Alternative - divide actions in two loops
        /*for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 != 0) {
                count++;
        }*/
        System.out.println(count);
    }
}
