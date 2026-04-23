package com.mac190.midtermreview2;

import java.util.Random;

public class Cube {
    private Rectangle base;
    private double height;

    public Cube(){
        base = new Rectangle();
        height = 0;
    }
    public Cube(Rectangle r, double h){
        base = new Rectangle(r);
        height = h;
    }
    public Cube(double a, double b, double h){
        base = new Rectangle(a, b);
        height = h;
    }
    //copy constructor
    public Cube(Cube c){
        base = new Rectangle(c.getBase());
        height = c.getHeight();
    }
    public double getLength(){
        return base.getLength();
    }
    public void setLength(double a){
        base.setLength(a);
    }
    public double getWidth(){
        return base.getWidth();
    }
    public void setWidth(double a){
        base.setWidth(a);
    }
    public Rectangle getBase() {
        return base;
    }
    public void setBase(Rectangle base) {
        this.base = base;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
    public boolean equals(Cube c){
        if(this.getBase().equals(c.getBase()) && this.height == c.getHeight()){
            return true;
        }
        return false;
    }
    public double area(){
        return 2.0*(this.base.area() + this.getLength()*height + this.getWidth()*height);
    }
    public double volume(){
        return this.getBase().area()*this.getHeight();
    }
    public Cube add(Cube c){
        return new Cube(this.base.add(c.base), this.height + c.height);
    }
    public static Cube add(Cube t, Cube c){
        return new Cube(t.base.add(c.base), t.height + c.height);
    }
}
