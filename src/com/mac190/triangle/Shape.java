package com.mac190.triangle;

import java.util.Objects;

/*
Design an abstact class shape that forces derived classes to implement
the following methods and member variables:
- double height
- getter and setter for heigh, throw checked exception if input is negative
- area as method
- Shape add (Shape) //add method that adds two shapes.
 */
abstract class Shape {
    private double height;
    public Shape(){
        height = 0;
    }
    public Shape(double a){
        height = Math.abs(a);
    }
    public Shape(Shape s){
        height = s.getHeight();
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) throws Exception{
        if(height < 0){
            throw new Exception("height cannot be negative");
        }
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Shape shape)) return false;
        return Double.compare(height, shape.height) == 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "height=" + height +
                '}';
    }
    public abstract double area();
    public abstract Shape add(Shape s);
}
