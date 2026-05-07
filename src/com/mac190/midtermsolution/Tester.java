package com.mac190.midtermsolution;

public class Tester {
    public static void main(String[] args) {
        //create a Device
        Device D1 = new Device("Apple", 90);
        System.out.println("D1: " + D1);
        Device D2 = new Device("Samsung");
        Device D3 = D1.add(D2);
        System.out.println("D3: " + D3);
        ISmartphone S1 = new ISmartphone(D1, 30);
        ISmartphone S2 = new ISmartphone("Nokia");
        System.out.println("S1: " + S1);
        System.out.println("S2: " + S2);
        ISmartphone S3 = S1.add(S2);
        System.out.println("S3: " + S3);
        ISmartphone S4 = ISmartphone.add(S1, S2);
        System.out.println("S4; " + S4);


    }
}
