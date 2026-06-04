package com.mac190.triangle;

import java.util.Objects;

/*
Design a class Pyramid that is a triangle with a pyramidHeight (different
from the height in the Shape class). (inherit from Triangle)
- setters and getters (setters throw checked exceptions if inputs are negative)
- tostring, equals methods
- method area returns the base triangle area multiplied by the pyramidHeight
- Pyramid add(Pyramid p) returns a Pyramid where the base Triangle
is the sum of the two triangles and the pyramidHeight is the average the
two pyramidHeights.
- implement the same method as static.
 */
public class Pyramid extends Triangle implements Addable{
    private double pyramidHeight;

    public Pyramid(){
        super();
        pyramidHeight = 0;
    }
    public Pyramid(double a){
        super(a);
        pyramidHeight = a;
    }
    public Pyramid(double a, double b, double c){
        super(a, b);
        pyramidHeight = c;
    }
    public Pyramid(Pyramid p){
        super(p.getBaseTriangle());
        pyramidHeight = p.getPyramidHeight();
    }
    public Pyramid(Triangle t, double h){
        super(t);
        pyramidHeight = h;
    }
    public double getPyramidHeight() {
        return pyramidHeight;
    }
    public void setPyramidHeight(double pyramidHeight) throws Exception{
        if(pyramidHeight < 0){
            throw new Exception("pyramidHeigh cannot be negative");
        }
        this.pyramidHeight = pyramidHeight;
    }
    public Triangle getBaseTriangle(){
        return this;
    }
    public void setBaseTriangle(Triangle T){
        try {
            this.setBase(T.getBase());
            this.setHeight(T.getHeight());
        }catch(Exception e){
            System.out.println("Should not happen");
        }
    }
    @Override
    public String toString() {
        return "Pyramid{" +
                "pyramidHeight=" + pyramidHeight +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pyramid pyramid)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(pyramidHeight, pyramid.pyramidHeight) == 0;
    }

    @Override
    public Addable add(Addable a) {
        if(!(a instanceof Pyramid p)){
            throw new ClassCastException("input should be a Pyramid");
        }
        return (Pyramid)((Shape)this).add((Shape)p);
        //OR return (Addable)((Shape)this).add((Shape)p);
    }

    @Override
    public double area() {
        return super.area()*pyramidHeight;
    }
    @Override
    public Shape add(Shape s) {
        if(!(s instanceof Pyramid p)){
            throw new ClassCastException("Input has to be a Pyramid");
        }
        return new Pyramid((Triangle)super.add((Shape)p), (pyramidHeight + p.getPyramidHeight())/2.0);
    }
}
