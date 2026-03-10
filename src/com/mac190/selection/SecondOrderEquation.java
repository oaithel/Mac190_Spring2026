package com.mac190.selection;
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
}
