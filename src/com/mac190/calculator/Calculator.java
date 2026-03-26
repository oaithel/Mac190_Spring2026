package com.mac190.calculator;
//TODO: HW6
public class Calculator {
    //member variables: two double operands and an operator (character)
    double first, second;
    char operator;

    //method calculate:
    //if the operator is + display the sum, if * display the product etc...
    public void calculate(){
        switch(operator){
            case '+':
                System.out.println(first + " + " + second + " = " + (first + second));
                break;
            case '-':
                System.out.println(first + " - " + second + " = " + (first - second));
                break;
            case '*':
                System.out.println(first + " * " + second + " = " + (first * second));
                break;
            case '/':
                if(second == 0){
                    System.out.println("Division by zero!!");
                }else {
                    System.out.println(first + " / " + second + " = " + (first / second));
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
