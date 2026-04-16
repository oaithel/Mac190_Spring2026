package com.mac190.minmax;

import com.mac190.prime.Prime;

public class MinMaxTester {
    public static void main(String[] args) {
        //create a default MinMax M1 set it to 5, 3
        MinMax M1 = new MinMax();
        M1.setMinMax(5, 3);
        //display it.
        System.out.println("M1: " + M1);
        //create a MinMax M2 with 8 and 4 as input
        MinMax M2 = new MinMax(8, 4);
        //display it.
        System.out.println("M2: "+ M2 );
        //create a MinMax M3 as the sum of M1 and M2 using member of the class method add
        MinMax M3= M1.add(M2);
        //display it
        System.out.println("M3: " + M3);

        //create a Prime M4 as the sum of M1 and M2 using the static method
        MinMax M4 = MinMax.add(M1, M2);
        //display it.
        System.out.println("M4: " + M4);
        M1.setMax(1);
        System.out.println("M1: " + M1);
        //create a MinMax M5 as (M1 + 6 + M2) using only the static methods and
        //one line code.
        MinMax M5 = MinMax.add(MinMax.add(M1, 6), M2);
        System.out.println("M5: " + M5);
    }
}
