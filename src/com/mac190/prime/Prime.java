package com.mac190.prime;
/*
Design class Prime that has the following properties:
- a private integer memeber variable prime that is prime at all times
- a default constructor that a sets prime to 2
- A constructor that accepts an integer input and sets prime
to the closed prime number to the input. ex .if input is 4 prime is set to 5
(use isPrime method to find the closed prime)
- getter
- setter sets prime to the closest prime to the input
- toString() return the object a s a string
- method public Prime add(int a) returns a Prime object that is the sum of this and a
- method public Prime add(Prime p) returns a Prime object that is the sum of this and p
- method static Prime add(Prime p1, Prime p2) returns a Prime object that is the
sum of p1 and p2, here this does not exist because it's static
- method static Prime add(Prime p1, int a) returns a Prime object that is the sum
of p1 and a. No this here because it's a static method
- test your class using all the methods.

 */
public class Prime {
    private int prime;
    static boolean isPrime(int a){
        //return true if a is prime and false if not
        //if a is less than 2 then return false
        if(a < 2)
            return false;
        //if a is 2 then return true
        if(a == 2)
            return true;
        //if a is even return false
        if(a %2 == 0)
            return false;
        //have a for loop going from 3 to sqrt(a) inclusive by steps of 2
        for(int i = 3; i <= Math.sqrt(a); i += 2) {
            //if a is divisible by i, then return false
            if (a % i == 0) {
                return false;
            }
        }
        //at the end of the loop return true.
        return true;
    }

}
