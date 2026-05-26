package com.mac190.vehicle;

public class VehicleTester {
    public static void main(String[] args) {
        //create a BMW
        //display it
        BMW yourBM = new BMW("SDFSDF131313", "X6", "Blue", 4);
        System.out.println("YourBM: " + yourBM);
        try {
            yourBM.moveBackwards();
            yourBM.moveForward();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            yourBM.speedUp(60);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        try {
            yourBM.moveBackwards();
        } catch (Exception e) {
        System.out.println("Exception: " + e.getMessage());
    }
        yourBM.brake();
        try{
        yourBM.moveBackwards();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        yourBM.turnRight(30);

        //create a Tesla object
        //display it
        Tesla T = new Tesla("SDFSDF13112313", "X", "Blue", 4);
        System.out.println("Tesla: " + T);
        T.moveForward();
        T.speedUp(60);
        T.moveBackwards();
        T.brake();
        T.moveBackwards();
        T.turnRight(30);
        //use a reference Vehicle V to drive the BMW. Increase the speed ...
        Vehicle V = (Vehicle) yourBM;
        try{
        V.moveBackwards();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("The speed is: " + V.getSpeed());
        //Move the referrence V from the BMW to the Tesla, drive it. Try
        //methods that should display error
        V = (Vehicle) T;
        try {
            V.moveBackwards();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        V.brake();
        System.out.println("make is: " + V.getMake());
        //Use an interface to drive yourBMW
        System.out.println(" --------Using interface");
        iDrive driveIt = yourBM;
        driveIt.brake();
        try {
            driveIt.moveForward();
            driveIt.speedUp(80);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        driveIt.turnLeft(30);
        try{
        driveIt.moveBackwards();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }


    }
}