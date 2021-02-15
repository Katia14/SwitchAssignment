package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Assignment 2.1
        int dayNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter day Number: ");
        dayNumber = input.nextInt();
        switch (dayNumber) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It's a working day");
                break;
            case 6:
            case 7:
                System.out.println("It's a holiday");
                break;
            default:
                System.out.println("Please enter day number from 1 to 7");
        }
        // Assignment 2.2
        char grade;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter exam grade: ");
        grade = sc.next().charAt(0);
        switch (grade) {
            case 'A':
            case 'B':
                System.out.println("Perfect! You are so clever!");
                break;
            case 'C':
                System.out.println("Good! But you can do better!");
                break;
            case 'D':
            case 'E':
                System.out.println("It is not good! You should study!");
                break;
            case 'F':
                System.out.println("Fail! You need to repeat the exam!");
                break;
            default:
                System.out.println("Please enter correct grade in UPPER case!");
        }
        //Assignment 2.3
        int x = 0;
        int y = 0;
        char action = 'p';
        Scanner scanner = new Scanner(System.in);
        {
            System.out.print("Please enter value for x: ");
        }
        x = input.nextInt();
        {
            System.out.print("Please enter value for y: ");
        }
        y = input.nextInt();

        System.out.print("Please enter required action: ");
        action = sc.next().charAt(0);
        switch (action) {
            case '+':
                System.out.println("The sum is: " + (x + y));
                break;
            case '-':
                System.out.println("The difference is: " + (x - y));
                break;
            case '*':
                System.out.println("The product is: " + (x * y));
                break;
            case '%':
                System.out.println("The quotient is: " + (x % y));
                break;
            case 'p':
                System.out.println("Both elements are: " + x + " and " + y);
                break;
            case 'b':
                System.out.println("X bigger than Y: " + (x > y));
                break;
            case 's':
                System.out.println("X smaller than Y: " + (x < y));
                break;
            default:
                System.out.println("Please enter correct action");

        }

    }
}

