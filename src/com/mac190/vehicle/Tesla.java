package com.mac190.vehicle;

import java.util.Objects;

/*
Design a class Tesla, that is a Vehicle, in addition it has the following:
FuelType is electric
Make is "Tesla"
Model of the car
It has a Color and number of seats as well.

Implement the methods as follows:
turnLeft, just display turning left the degree amount
same for turn right
Brake implement it so that the car is put in stop mode
moveForward implement it so that the car moves forward only if it was in
stopped state already
Same for moveBackwards
implement speedUp to increase the speed by no more than 10miles/hour
or the input (if the input is less than 10 m/h) and display the speed, limit the speed to 80miles/hour
speedUp only increases if it is movingForward.
Test your class.
*/
public class Tesla extends Vehicle{
    private String model, color;
    private int numberSeats;
    private State state;
    private double speed;

    public Tesla(){
        super("N/A", "Tesla", "Electric");
        model = "N/A";
        color = "N/A";
        numberSeats = 0;
        speed = 0;
    }
    public Tesla(String V, String m, String col, int ns){
        super(V, "Tesla", "Electric");
        model = m;
        color = col;
        numberSeats = ns;
        speed = 0;
    }
    public Tesla(Tesla b){
        super(b.getVIN(), "BMW", "Gas");
        model = b.model;
        color = b.color;
        numberSeats = b.numberSeats;
        speed = 0;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getNumberSeats() {
        return numberSeats;
    }
    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public State getState() {
        return state;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", numberSeats=" + numberSeats +
                ", state=" + state +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Tesla t)) return false;
        if (!super.equals(o)) return false;
        return numberSeats == t.numberSeats && Objects.equals(model, t.model) && Objects.equals(color, t.color) ;
    }

    @Override
    public void turnRight(double degrees) {
        System.out.println("Turning right " + degrees + " degrees");
    }

    @Override
    public void turnLeft(double degrees) {
        System.out.println("Turning left " + degrees + " degrees");
    }
    @Override
    public void brake() {
        if(state == State.STOPPED){
            System.out.println("Already stopped");
            return;
        }
        System.out.println("Stopping ....");
        state = State.STOPPED;
    }
    @Override
    public boolean speedUp(double sp) {
        if(state == State.FORWARD){
            sp = Math.min(sp, 10);
            speed = Math.min(sp + 10, 100);
            System.out.println("Speeding at " + speed + " mph");
            return true;
        }
        System.out.println("we cannot speedup");
        return false;
    }
    @Override
    public boolean moveBackwards() {
        if(state == State.BACKWARDS){
            System.out.println("Moving backwards already!");
            return false;
        }
        if(state == State.STOPPED){
            System.out.println("Moving backwards");
            speed = 10;
            return true;
        }
        System.out.println("You have to stop first");
        return false;
    }

    @Override
    public boolean moveForward() {
        if(state == State.FORWARD){
            System.out.println("Already moving forward");
            return false;
        }
        if(state == State.BACKWARDS){
            System.out.println("You have to stop first before moving forward");
            return false;
        }
        System.out.println("Moving forward at 10 mph");
        speed = 10;
        return true;
    }
}
