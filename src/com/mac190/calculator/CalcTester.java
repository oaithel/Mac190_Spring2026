package com.mac190.calculator;

import java.util.Scanner;

public class CalcTester {
    public static void main(String[] args) {
        //Make this code run for as long as the user wishes to continue.
        char answer = 'y';
        do {
            //Create a Calculator object
            Calculator calc = new Calculator();
            //read a string in the form A + B (with spaces between the numbers and the operator)
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an expression in the form A + B: ");
            //assign the operands and the operator to the object
            calc.first = sc.nextDouble();
            calc.operator = sc.next().charAt(0);
            calc.second = sc.nextDouble();
            //invoke calculate
            calc.calculate();
            //ask the use if he/she wishes to continue.
            System.out.println("Do you want to continue? [y/n]");
            answer = sc.next().charAt(0);
        }while(Character.toLowerCase(answer) != 'n');
    }
}
