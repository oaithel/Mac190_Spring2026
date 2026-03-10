package com.mac190.input;

import java.util.Scanner;

/*
Write a program that reads three integers from the user and displays their average
 */
public class Average {
    public static void main(String[] args) {
        //We need three inputs, integers therefore need three interger variables
        int v1, v2, v3;
        //create a Scanner object
        Scanner keyb = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        v1 = keyb.nextInt();
        v2 = keyb.nextInt();
        v3 = keyb.nextInt();
        //compute the average
        double average = (double)(v1 + v2 + v3) / 3.0; // int/int = int, int/double= double
                //double/int = double double/double = double
        System.out.println("Average: " + average);

    }

}

