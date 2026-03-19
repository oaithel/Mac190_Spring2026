package com.mac190.loops;

import java.util.Scanner;

/*
TODO: HW4
Write a program that reads an integer from the user for the number of lines to display.
The displays that number of lines with each line having that number of stars.
Enter the number of lines: 5
*****
*****
*****
*****
*****


Once that is done. Modify the program to display the following shape:
If input is 5

*
**
***
****
*****

One loop that goes through the lines call it i loop, then inside one loop
that displays the number of stars for that line.
i  (line number)        j(stars)  How many stars to display at line i = i+1
0                       1   j loop should loop i+1 times.
1                       2
2                       3
3                       4
4                       5
i loop loops the number of lines times

Shape 2:
*****
****
***
**
*

i (goes through lines)  j (stars)
0                       5
1                       4
2                       3
3                       2
4                       1

i + j = nLines ---> j = nLines - i at lines i you need
to display nLines - i stars
 */
public class stars {
    public static void main(String[] args) {
        //Read a number from the user into lineNumber
        Scanner  sc = new Scanner(System.in);
        System.out.println("enter the number of lines: ");
        int nLines = sc.nextInt();
        //loop lineNumber times
        for(int i = 0; i < nLines; i++) {
            //Inside the loop, loop again lineNumber times
            for(int j = 0; j < nLines; j++) {
                //display one star at a time
                System.out.print("*");
            }
            //go to next line to display the next line.
            System.out.println("");
        }
        System.out.println("-----------Triangle Shape 1-----");
        for(int i = 0; i < nLines; i++) {
            //Inside the loop, loop again lineNumber times
            for(int j = 0; j < i+1; j++) {
                //display one star at a time
                System.out.print("*");
            }
            //go to next line to display the next line.
            System.out.println("");
        }
        System.out.println("-----------Triangle Shape 2-----");
        for(int i = 0; i < nLines; i++) {
            //Inside the loop, loop again lineNumber times
            for(int j = 0; j < nLines-i; j++) {
                //display one star at a time
                System.out.print("*");
            }
            //go to next line to display the next line.
            System.out.println("");
        }
    }
}
