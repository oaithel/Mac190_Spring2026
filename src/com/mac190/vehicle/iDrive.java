package com.mac190.vehicle;
/*
An interface is similar to an abstact class with all methods
abstract. No member variables can be declared except static variables.

 */
public interface iDrive {
    State getState();
    double getSpeed();
    void turnRight(double degrees);
    void turnLeft(double degrees);
    void brake(); //puts the car into a stop mode.
    boolean speedUp(double speed);
    boolean moveBackwards();
    boolean moveForward();
}
