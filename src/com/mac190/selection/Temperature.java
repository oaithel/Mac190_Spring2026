package com.mac190.selection;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
Write a program that converts Celcius to Fahrenheit and vice-versa.
1) ask the user which conversion he/she wishes to perform: For instance
enter 1 to convert from Fahrenheit to Celcius
enter 2 to convert from Celcius to fahrenheit

If choice is 1, then compute the celcius = fahren - 32 * 5/9  display it
If choice is 2, then compute the fahren = celcius *9/5 + 32 display it
 */
public class Temperature {
    public static void main(String[] args) {
        System.out.println("Press C to convert into Fahrenheit\n " +
                "Press F to convert into Celcius");
        Scanner keyb = new Scanner(System.in);
        char choice = keyb.next().charAt(0); //The first character of the input word
        //We have three different cases: C F or enything else. Need two if-else
        if(Character.toLowerCase(choice) == 'c'){
            //ask for the celcius temperature
            System.out.println("Enter the celcius temperature: ");
            double celcius = keyb.nextDouble();
            double fahrenheit = celcius*9.0/5.0 + 32;
            System.out.println(celcius + " in celcius is " + fahrenheit + " in fahrenheit");
        }else if(Character.toLowerCase(choice) == 'f'){
            System.out.println("Enter the fahrenheit temperature: ");
            double fahrenheit = keyb.nextDouble();
            double celcius = (fahrenheit - 32)*5.0/9.0;
            System.out.println(fahrenheit + " in fahenheit is " + celcius + " in celcius");
        }else{
            System.out.println("Invalid choice");
        }
    }
}
