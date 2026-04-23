package com.mac190.midtermreview2;

import org.w3c.dom.css.Rect;

import java.util.Objects;

public class Rectangle {
    private double length, width;

    public Rectangle(){
        length = width = 0;
    }
    public Rectangle(double a){
        length = width = Math.abs(a);
    }
    public Rectangle(double a, double b){
        width = Math.abs(a);
        length = Math.abs(b);
    }
    //copy constructor
    public Rectangle(Rectangle r){
        width = r.width;
        length = r.length;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public boolean equals(Rectangle o) {
        return Double.compare(length, o.length) == 0 && Double.compare(width, o.width) == 0;
    }
    public double area(){
        return width*length;
    }
    public double perimeter(){
        return 2*(length + width);
    }
    public Rectangle add(Rectangle r){
        return new Rectangle(this.width + r.width, this.length+r.length);
    }
    public static Rectangle add(Rectangle t, Rectangle r){
        return new Rectangle(t.width + r.width, t.length+r.length);
    }

}
