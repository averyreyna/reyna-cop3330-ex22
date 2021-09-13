/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Avery Reyna
 */

package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // asks the user for their three numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int inputNum1 = Integer.parseInt(input.nextLine());

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        int inputNum2 = Integer.parseInt(input2.nextLine());

        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter the third number: ");
        int inputNum3 = Integer.parseInt(input3.nextLine());

        // checks each number to see which one is the biggest followed by the output statement
        if (inputNum1 > inputNum2 && inputNum1 > inputNum3)
        {
            System.out.println(String.format("The largest number is %d.", inputNum1));
        }
        else if (inputNum2 > inputNum1 && inputNum2 > inputNum3)
        {
            System.out.println(String.format("The largest number is %d.", inputNum2));
        }
        else if (inputNum3 > inputNum1 && inputNum3 > inputNum2)
        {
            System.out.println(String.format("The largest number is %d.", inputNum2));
        }
    }
}