package com.mac190.vehicle;

import java.util.Objects;

/*
Design an abstract class Vehicle that has the following:
VIN number,
make (the brand)
fuelType
setters/getters

Methods, you want any derived class to implement the following methods
void turnRight(double degrees);
void turnLeft(double degrees);
void brake(); //puts the car into a stop mode.
boolean speedUp(double speed);
boolean moveBackwards();
boolean moveForward();
*/
public abstract class Vehicle {
    private String VIN, make, fuelType;

    public Vehicle(){
        VIN = "N/A";
        make = "N/A";
        fuelType = "N/A";
    }
    public Vehicle(String V, String M, String f){
        VIN = V;
        make = M;
        fuelType = f;
    }
    public Vehicle(Vehicle v){
        VIN = v.VIN;
        make = v.make;
        fuelType = v.fuelType;
    }
    public String getVIN() {
        return VIN;
    }
    public void setVIN(String VIN) {
        this.VIN = VIN;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "VIN='" + VIN + '\'' +
                ", make='" + make + '\'' +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Vehicle vehicle)) return false;
        return Objects.equals(VIN, vehicle.VIN) && Objects.equals(make, vehicle.make) && Objects.equals(fuelType, vehicle.fuelType);
    }
    public abstract double getSpeed();
    public abstract void turnRight(double degrees);
    abstract void turnLeft(double degrees);
    public abstract void brake(); //puts the car into a stop mode.
    public abstract boolean speedUp(double speed);
    public abstract boolean moveBackwards();
    public abstract boolean moveForward();
}
