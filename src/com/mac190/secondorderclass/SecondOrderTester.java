package com.mac190.secondorderclass;

import java.util.Scanner;

public class SecondOrderTester {
    public static void main(String[] args) {
        //copy main from SecondOrderEquation code and change it to
        //use a SecondOrder object
        SecondOrder sec  = new SecondOrder();
        Scanner keyb = new Scanner(System.in);
        System.out.println("enter the coefficients of the equation: ");
        sec.a = keyb.nextDouble();
        sec.b = keyb.nextDouble();
        sec.c = keyb.nextDouble();
        sec.solve();
    }
}
