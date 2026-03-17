package com.mac190.loops;

import java.util.Scanner;

/*
Loops are the heart of computer science.
Loops allow you to deal with large amounts of data.
There are three kind of loops and all of them are equivalent, that is a for loop
can be written as a while loop and vice versa.
1- while loop.
initialization (any instruction that gives initial value for the condition)
while(condition){
    Statements;
    Increment;
}
As long as the condition is true execute Statements.
Statement are any instructions we need to execute for the life the loop,
it can contain another loop, if-else etc...
Increment is any instruction that may affect the value of the condition. At one point the
condition needs to be false otherwise we get an infinite.
Q) What is the initiallization, condition, statements and increment in the following cases:
1)
1.int Total = 10;
2.int i = 2;
3.while(i <= 6){
4.    Total = 2*Total/3- i;
5.    i += 2;
6.}

Initialization: i = 2; (NOT Total because Total is not part of the condition
condition: i <= 6 The condition evaluates to true or false only at any given time.
Statements: Total = 2*Total/3- i; (it does not affect the condition
Increment: i += 2

2) For loop is a reorganization of a while loop. Often, we forget initialization or incrment
in a while loop, a for loo requires you to state them.
Rewrite the previous loop as a for loop.
for(int i = 2; i <= 6; i += 2){
    Statements;
}

Trace the following loop:
1.int Total = 10;
2.int i = 2;
3.while(i <= 6){
4.    Total = 2*Total/3- i;
5.    i += 2;
6.}

1. Total = 10;
2. i = 2;
3. while(2 <= 6) true
    4. Total = 2*10/3 - 2 = 20/3 - 2 = 6 - 2 = 4
    5. i = 2+2 = 4
3. while(4 <= 6) true
    4. Total = 2*4/3 - 4 = 8/3 - 4 = 2 - 4 = -2
    5. i = 4+2 = 6
3. while(6 <= 6) true
    4. Total = 2*(-2)/3 - 6 = -4/3 - 6 = -1-6 = -7
    5. i = 6+2 = 8
3. while(8 <= 6) false get out of the loop.
 */
/*
Always use  for loop if you know the number of times the loop loops.
A loop that loops 5 times:
for(int i = 0; i < 5; i++){
    Statements;
}

//A loop that reads numbers from the user for as long as the input is positive.
It will stop when the input is negative.
Use a while loop because we don't know how many times the user will input a positive
number.


 */
public class IntroLoops {
    public static void main(String[] args) {
        //Modify this code to compute the sum of all positive numbers entered, the largest
        //number, the smallest number and the number of even numbers entered. Display all these
        //at the end of the loop.
        //A loop that reads numbers from the user for as long as the input is positive
        Scanner sc = new Scanner(System.in);
        //read one number first
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int smallest = num;
        int largest = num;
        int sum = 0;
        int evenCount = 0;
        while(num > 0){
            sum += num;
            if(smallest > num){
                smallest = num;
            }
            if(largest < num){
                largest = num;
            }
            if(num%2 == 0){
                evenCount++;
            }
            System.out.println("You entered a positive number");
            //read a new number
            System.out.println("Enter a number: ");
            num = sc.nextInt();

        }
        System.out.println("sum : " + sum + " largest: " + largest + " smallest: " + smallest + " num evens: " + evenCount);
    }

}
