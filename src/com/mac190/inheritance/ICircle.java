package com.mac190.inheritance;


import com.mac190.midtermreview.Point;

import java.util.Objects;

//Because every Circle IS a point (center) and a radius, therefore I cn use
//inheritance. ICircle will inherite all member variables from Point
public class ICircle extends Point {
    private double radius;

    public ICircle(){
        super(); //this creates the Point object within Circle
        radius = 0;
    }
    public ICircle(Point p, double r){
        //center = new Point(p); My preference
        super(p);//uses the copy constructor for Point
        radius = r;
    }
    public ICircle(double a, double b, double r){
        super(a, b);
        radius = r;
    }
    public ICircle(double r){
        super();
        radius = r;
    }
    public ICircle(ICircle c){
        super(c);//because c is a Point object
        //OR center = c.getCenter();
        radius = c.getRadius();
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Point getCenter() {
        return this;
    }
    public void setCenter(Point center) {
        this.setXY(center.getX(), center.getY());
    }

    @Override
    public String toString() {
        return "ICircle{" +
                "radius=" + radius +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ICircle iC)) return false;
        if(!super.equals(iC)) {
            return false;
        }
        return Double.compare(radius, iC.radius) == 0;
    }

    public double area(){
        return Math.PI*Math.pow(radius, 2);
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }

    public ICircle add(ICircle c){
        return new ICircle(super.add(c.getCenter()), this.radius + c.radius);
    }
    public static ICircle add(ICircle t, ICircle c){
        return new ICircle(t.getCenter().add(c.getCenter()), t.radius + c.radius);
    }
}
