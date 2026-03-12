package com.mac190.secondorder;

import java.util.Scanner;

/*
Design a program that solves a second order equation of the form:
ax^2 + bx + c = 0.
You need the coefficients a, b, and c as inputs from the user
You have two cases for a:
a is 0
    you have two cases for b:
       b is 0
            you have two cases for c:
                c is zero therefore you have infinite number of solutions
                c is not zero, then there are no solutions
       b is not zero
            You have a first order equation and the solution is -c/b
a is not 0
       Compute D the discriminant = b^2 - 4ac
       You have three cases:
       D is zero then there is one double solution -b/2a
       D is larger than 0, then there are two distinct solutions:
            X1 = -b + sqrt of D/2a
            X2 = -b - sqrt od D/2a
       D is negative, then there are no real solutions.


 */
public class SecondOrderEquation {
    public static void main(String[] args) {
        double a, b, c;
        Scanner keyb = new Scanner(System.in);
        System.out.println("enter the coefficients of the equation: ");
        a = keyb.nextDouble();
        b = keyb.nextDouble();
        c = keyb.nextDouble();

        if(a == 0){
            if(b == 0){
                if(c == 0){
                    System.out.println("The equation has infinite solution (0=0)");
                }else{
                    System.out.println("No solution (C = 0)");
                }
            }else{
                double x = -c/b;
                System.out.println("this is first order equation, solution: " + x);
            }
        }else{
            //compute the discriminant
            double D = Math.pow(b, 2) - 4*a*c;
            if(D == 0) {
                double X = -b/(2*a);
                System.out.println("There is one double solution: " + X);

            }else if(D > 0) {
                double X1 = (-b + Math.sqrt(D))/(2*a);
                double X2 = (-b - Math.sqrt(D))/(2*a);
                System.out.println("There are two distinct solutions: X1 = " + X1 + " X2 = " + X2);
            }else{
                System.out.println("there no real solutions.");
            }
        }
    }
}
