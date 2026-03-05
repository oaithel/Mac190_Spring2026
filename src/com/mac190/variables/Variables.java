package com.mac190.variables;/*
A variables is a memory space (a name associated with that space) where data is saved.
Each variable has a unique identifier to be able to refer to it.
The name of a variable should not
- Should not start with a digit
- Should not be one of the reserved words (if, else, while, for, do break, continue, class, public, provate
.....)
- Should not contain a special character: `~!@#$%^&*()=-+|\{}[];:'"<>,.?/
The most annoying special character is: space because once yu have space you have two names.

Each variable has a type: int, long, double, float ....
What is the type for? The type specifies the amount od memory needed and the way the data
is saved. Decomal numbers are not saved in the same form as integer numbers, same thing
characters.

To display a value of a variable, we use the name of the variable outside the double quotes.

When defining a variable use names that speak. I.e 1000 lines later I know what the
variable is used for. If the variable name has multiple names in it, write
the first name lower case followed by the names with first letter capital.
int numberOfStudentsInTheClass; //this is a convention

 */

public class Variables {
    public static void main(String[] args) {
        int var = 2;
        float f = 3.45f; //f at the end distinguish it from double
        System.out.println("var: " + var + " the float f is; " + f);
        //Define a variable to contain the number of students in the class.
        //there are 18. Display it.
        //define the change you have in your pocket, you have 14 dollars and 37 cents
        //display it.
        //add it 2 dollars and 45 cents, then display.

        //subtract from it 1 less than it's third. display it

        //define a variable to contain your name, display it

        //define a variable to contain the answer to a question as y for yes and n for no.
        //the answer is yes. display it.

        //define a variable to contain the exact number of dollars in your pocket, find it and display it

        //define a varianle to contain the exact number of cents in your pocket, find it and display it.


    }

}
