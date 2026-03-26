package com.mac190.calculator;

//TODO: HW6
public class Calculator {
    //member variables: two double operands and an operator (character)
    private double first, second;
    private char operator;

    //getters/accessors are methods that allow you to access the value of a private
    //member variable.
    public double getFirst(){
        return first;
    }
    public double getSecond(){
        return second;
    }
    public double getOperator(){
        return operator;
    }
    //To be able to change a value of a private member we use setters/mutators.
    //public void setVaribleName(varaibkeType input) {
            // variableName = input;
    //}
    public void setFirst(double d){
        first = d;
    }
    public void setSecond(double d){
        second = d;
    }
    public void setOperator(char c){
        operator = c;
    }
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

    //toString: every object in java inherits from Object super class.
    //and therefore in herits two methods: toString and equals
    //toString is method that returns the object as a String: How do you
    //want your objects to be displayed.
    public String toString(){
        String st = first + " " + operator + " " + second;
        return st;
    }
}
