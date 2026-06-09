package com.mac190.triangle;
//Test both classes and use both the abstract class as a refrence and
//use as well the interface Addable in an example.
public class TriangleTester {
    public static void main(String[] args) {
        //create a default Triangle
        Triangle T1 = new Triangle();
        System.out.println("T1: " + T1);
        try {
            T1.setBase(10);
            T1.setHeight(20);
        }catch (Exception e){
            System.out.println("Caught exceptin: " + e.getMessage());
        }
        System.out.println("T1: " + T1);
        //create an object Shape S1.
        Shape S1 = new Triangle(10, 40);
        try {
            S1.setHeight(20);
        }catch(Exception e){
            System.out.println("exception: " + e.getMessage());
        }
        System.out.println("S1: " + S1);
        System.out.println("S1 area: " + S1.area());
        //make a Triangle T2 as the sum of T1 and S1.
        Triangle T2 = (Triangle)T1.add(S1);
        System.out.println("T2: " + T2);
        //Use the interface Addable in some way
        Addable A1 = T1;
        System.out.println("A1 area: " + A1.area());
        Addable A2 = A1.add(T2);
        System.out.println("A2: " + A2);

        //make a Pyramid out of T1 and 30
        Pyramid P1 = new Pyramid(T1, 30);
        System.out.println("P1: " + P1);
        //create a Pyramid P2 that is the sum of T1 and T2 and pyramidHeight
        // of 10 in one line of code.
        Pyramid P2 = new Pyramid((Triangle) T1.add((Shape)T2), 10);
        System.out.println("P2: " + P2);
        A1 = P2;



    }
}
