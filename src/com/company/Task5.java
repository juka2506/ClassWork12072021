package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter how many numbers you want: ");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < number; i++) {
            System.out.print("Enter a number: ");
            if(scanner.nextInt() % 2 != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
