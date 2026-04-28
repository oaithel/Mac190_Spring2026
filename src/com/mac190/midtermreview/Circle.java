package com.mac190.midtermreview;

import java.util.Objects;

public class Circle {
    private Point center;
    private double radius;

    public Circle(){
        center = new Point();
        radius = 0;
    }
    public Circle(Point p, double r){
        //center = new Point(p); My preference
        center = p;
        radius = r;
    }
    public Circle(double a, double b, double r){
        center = new Point(a, b);
        radius = r;
    }
    public Circle(double r){
        center = new Point();
        radius = r;
    }
    //copy constructor
    public Circle(Circle c){
        center = new Point(c.getCenter());
        //OR center = c.getCenter();
        radius = c.getRadius();
    }
    public Point getCenter() {
        return center;
    }
    public void setCenter(Point center) {
        this.center = center;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getX(){
        return center.getX();
    }
    public double getY(){
        return center.getY();
    }
    public void setX(double a){
        center.setX(a);
    }
    public void setY(double a){
        center.setY(a);
    }
    public void setXY(double a, double b){
        center.setXY(a, b);
    }
    public String toString(){
        return "{" + center + ", " + radius + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0 && Objects.equals(center, circle.center);
    }

    public double area(){
        return Math.PI*Math.pow(radius, 2);
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }

    public Circle add(Circle c){
        return new Circle(this.center.add(c.center), this.radius + c.radius);
    }
    public static Circle add(Circle t, Circle c){
        return new Circle(t.center.add(c.center), t.radius + c.radius);
    }
}
