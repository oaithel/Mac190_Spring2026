package com.mac190.prime;

public class PrimeTester {
    public static void main(String[] args) {
        //create a default Prime P1, set it to 4
        Prime P1 = new Prime();
        P1.setPrime(4);
        //display it.
        System.out.println("P1: " + P1);
        //create a Prime P2 with 8 as input
        Prime P2 = new Prime(8);
        //display it.
        System.out.println("P2: " + P2);
        //create a Prime P3 as the sum of P1 and P2 using member of the class method add
        Prime P3 = P1.add(P2);
        //display it
        System.out.println("P3: " + P3);
        //create a Prime P4 as the sum of P1 and P2 using the static method
        Prime P4 = Prime.add(P1, P2);
        //display it.
        System.out.println("P4: " + P4);
        //create a Prime P5 as (P1 + 6 + P2) using only the static methods and
        //one line code.
        Prime P5 = Prime.add(Prime.add(P1, 6), P2);
        System.out.println("P5: " + P5);
    }
}
