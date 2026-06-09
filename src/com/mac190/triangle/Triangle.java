package com.mac190.triangle;

import java.util.Objects;

/*
Design and code a class Triangle that has the following properties:
- A Triangle is a shape, inherit from Shape class.
-Two double member variables base and height
-setters for both, throw a checked exception if the inputs are negative.
DO NOT handle exception in the same method, forward it
- getters for both.
- default constructor to set both t 0
- Constructor that accepts one double and sets both to it
- constructor that accepts two doubles, the first for base the second for height
- Copy constructor.
- toString equals methods
- method Triangle add(Object R) if R is not a Triangle then throw an unchecked exception
the method returns a Triangle with base as th sum of the two bases and the
height as th average of the two heights.
- implement the method add above as a static method.
- implement area as the base multiplied by the height
 */
public class Triangle extends Shape implements Addable{
    private double base;
    public Triangle(){
        super();
        base = 0;
    }
    public Triangle(double a){
        super(a);
        base = a;
    }
    public Triangle(double a, double b){
        super(b);
        base = a;
    }
    public Triangle (Triangle t){
        super(t.getHeight());
        base = t.base;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) throws Exception{
        if(base < 0){
            throw new Exception("base cnnot be negative");
        }
        this.base = base;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Triangle triangle)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(base, triangle.base) == 0;
    }

    @Override
    public Addable add(Addable a) {
        if(! (a instanceof Triangle t)){
            throw new ClassCastException("input needs to be a Triangle");
        }
        return (Triangle)((Shape)this).add((Shape)t);
    }

    @Override
    public double area() {
        return base*this.getHeight();
    }
    @Override
    public Shape add(Shape s) {
        if(!(s instanceof Triangle t)){
            throw new ClassCastException("input is not a Triangle");
        }
        return new Triangle(this.base + t.getBase(), (this.getHeight() + t.getHeight())/2.0);
    }
}
