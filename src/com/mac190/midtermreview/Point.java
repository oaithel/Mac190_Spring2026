package com.mac190.midtermreview;

public class Point {
    private double X, Y;

    public Point(){
        X = Y = 0;
    }
    public Point(double a){
        X = Y = a;
    }
    public Point(double a, double b){
        X = a;
        Y = b;
    }
    //copy constructor
    public Point(Point p){
        X = p.X;
        Y = p.Y;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }
    public void setXY(double a, double b){
        X = a;
        Y = b;
    }
    public String toString(){
        return "(" + X + ", " + Y + ")";
    }
    public boolean equals(Point p){
        if(this.X == p.X && this.Y == p.Y){
            return true;
        }else{
            return false;
        }
    }
    public double distance(Point p){
        return Math.sqrt(Math.pow(this.X - p.X, 2) + Math.pow(this.Y - p.Y, 2));
    }
    public Point add(Point other){
        return new Point((this.X + other.X)/2.0, (this.Y + other.Y)/2.0);
    }
    public static Point add(Point t, Point other){
        return new Point((t.X + other.X)/2.0, (t.Y + other.Y)/2.0);
    }

}
