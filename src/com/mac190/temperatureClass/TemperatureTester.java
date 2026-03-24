package com.mac190.temperatureClass;

import java.util.Scanner;

public class TemperatureTester {
    public static void main(String[] args) {
        //create an object Temperature
        Temperature temp = new Temperature();
        System.out.println("Press C to convert into Fahrenheit\n " +
                "Press F to convert into Celcius");
        Scanner keyb = new Scanner(System.in);
        char choice = keyb.next().charAt(0); //The first character of the input word
        //We have three different cases: C F or enything else. Need two if-else

        switch(choice){
            case 'c':
            case 'C': {
                //ask for the celcius temperature
                System.out.println("Enter the celcius temperature: ");
                temp.inTemperature = keyb.nextDouble();
               //invoke the method toFahrenheit
                temp.toFahrenheit();
                break; //if no break the next case will be executed as well
            }
            case 'f':
            case 'F': {
                System.out.println("Enter the fahrenheit temperature: ");
                temp.inTemperature = keyb.nextDouble();
                temp.toCelcius();
                break;
            }
            default:
                System.out.println("Invalid choice");
        }
    }
}
