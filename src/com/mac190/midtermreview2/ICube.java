package com.mac190.midtermreview2;
/*
Implement the Cube class using inheritance, knowing that every Cube
IS a Rectangle in addition it has a height.
 */
public class ICube extends Rectangle{
    private double height;

    public ICube(){
        super();
        height = 0;
    }
    public ICube(Rectangle r, double h){
        super(r); //will call the copy constructor of Recangle
        height = h;
    }
    public ICube(double a, double b, double h){
        super(a, b);
        height = h;
    }
    //copy constructor
    public ICube(ICube c){
        super(c.getBase());
        height = c.getHeight();
    }
    public Rectangle getBase() {
        return this;
    } //ICube IS a Rectangle
    public void setBase(Rectangle base) {
        this.setLength(base.getLength());
        this.setWidth(base.getWidth());
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "ICube{" +
                "base=" + super.toString() +
                ", height=" + height +
                '}';
    }
    public boolean equals(ICube c){
        return (super.equals(c.getBase()) && this.height == c.getHeight());
    }
    public double area(){
        return 2.0*(super.area() + this.getLength()*height + this.getWidth()*height);
    }
    public double volume(){
        return super.area()*this.getHeight();
    }
    public ICube add(ICube c){
        return new ICube(super.add(c.getBase()), this.height + c.height);
    }
    public static ICube add(ICube t, ICube c){
        return new ICube(t.getBase().add(c.getBase()), t.height + c.height);
    }

}
