package com.mac190.minmaxprime;

import com.mac190.minmax.MinMax;

public class MinMaxPrimeTester {
    public static void main(String[] args) {
        //create a default MinMax M1 set it to 5, 3
        MinMaxPrime M1 = new MinMaxPrime();
        M1.setMinMax(5, 3);
        //display it.
        System.out.println("M1: " + M1);
        //create a MinMax M2 with 8 and 4 as input
        MinMaxPrime M2 = new MinMaxPrime(8, 4);
        //display it.
        System.out.println("M2: "+ M2 );
        //create a MinMax M3 as the sum of M1 and M2 using member of the class method add
        MinMaxPrime M3= M1.add(M2);
        //display it
        System.out.println("M3: " + M3);

        //create a Prime M4 as the sum of M1 and M2 using the static method
        MinMaxPrime M4 = MinMaxPrime.add(M1, M2);
        //display it.
        System.out.println("M4: " + M4);
        M1.setMax(1);
        System.out.println("M1: " + M1);
        //create a MinMax M5 as (M1 + 6 + M2) using only the static methods and
        //one line code.
        MinMaxPrime M5 = MinMaxPrime.add(MinMaxPrime.add(M1, 6), M2);
        System.out.println("M5: " + M5);
    }
}
