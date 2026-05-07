package com.mac190.vehicle;

import java.util.Objects;

/*
Design a class BMW, that is a Vehicle, in addition it has the following:
FuelType is gas
Make is "BMW"
Model (example "X6")
It has a Color and number of seats as well.

Implement the methods as follows:
turnLeft, just display turning left the degree amount
same for turn right
Brake implement it so that if the car is not in stop mode, put it in stop mode
moveForward implement it so that the car moves forward (initial speed 10m/h) only if it was in stopping state already
Same for moveBackwards
implement speedUp to increase the speed by the input.
and display the speed, limit the speed to 100miles/hour
speedUp only increases the speed if it is movingForward.

Test your class.

 */
public class BMW extends Vehicle implements iDrive{
    private String model, color;
    private int numberSeats;
    private State state;
    private double speed;

    public BMW(){
        super("N/A", "BMW", "Gas");
        model = "N/A";
        color = "N/A";
        numberSeats = 0;
        speed = 0;
    }
    public BMW(String V, String m, String col, int ns){
        super(V, "BMW", "Gas");
        model = m;
        color = col;
        numberSeats = ns;
        speed = 0;
    }
    public BMW(BMW b){
        super(b.getVIN(), "BMW", "Gas");
        model = b.model;
        color = b.color;
        numberSeats = b.numberSeats;
        speed = 0;
    }

    public State getState() {
        return state;
    }

    public double getSpeed() {
        return speed;
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

    @Override
    public String toString() {
        return "BMW{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", numberSeats=" + numberSeats +
                ", state=" + state +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof BMW bmw)) return false;
        if (!super.equals(o)) return false;
        return numberSeats == bmw.numberSeats && Objects.equals(model, bmw.model) && Objects.equals(color, bmw.color) ;
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
            speed = Math.min(speed + sp, 100);
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
