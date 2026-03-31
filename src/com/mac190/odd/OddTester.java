package com.mac190.odd;
//TODO: HW7 complete Odd class and test it. Write a samll paragraph outlining what
//did you learn as new from this project.
public class OddTester {
    public static void main(String[] args) {
        //Create an Odd object od1, assign 4 to num.
        Odd od1 = new Odd();
        od1.setNum(4);
        //display it.
        System.out.println("O1: " + od1);
        //create another Odd object od2, assign to it 7
        Odd od2 = new Odd();
        od2.setNum(7);
        System.out.println("Od2: " + od2);
        //using add method show od1 added to it 6
        int sum = od1.add(6);
        System.out.println("sum: " + sum);//11
        //using add method show result of adding ad1 and od2 objects.
        sum = od1.add(od2);
        System.out.println("sum: " + sum);//12
        //Create a new Odd object with value 8 right at the beginning without using
        //the setter
        Odd od3 = new Odd(8);
        System.out.println("od3: " + od3);
        //Use sum method to add od1 and od2 to crate od4
        Odd od4 = od1.sum(od2);
        System.out.println("Od4: " + od4);
        //add od1 to od2
        //display both od1 and od2
        //set od3 to (ad1 + 6) + od2 in one instruction.

    }
}
