package com.mac190.midtermreview;

import com.mac190.inheritance.ICircle;

public class midtermTester {
    public static void main(String[] args) {
        Point P1 = new Point();
        System.out.println("P1: " + P1);
        P1.setXY(2, 6);
        Point P2 = new Point(3, 7);
        double d = P1.distance(P2);
        System.out.println("Distance from " + P1 + " to " + P2 + " is " + d);
        System.out.println("And the mid point is: " + P1.add(P2));
        ICircle C1 = new ICircle (P1, 5);
        System.out.println("C1: " + C1 + " area: " + C1.area() + " parim: " + C1.perimeter());
        ICircle C2 = new ICircle(2, 4, 6);
        System.out.println("C2: " + C2);
        ICircle C3 = ICircle.add(C1, C2);
        System.out.println("C3: " + C3 + " area: " + C3.area() + " parim: " + C3.perimeter());

    }
}
