package com.mac190.reviewfinal;

import java.util.Objects;

public class Car extends Vehicle implements Addable {
    private double fuelTankCapacity, mpg;

    public Car(){
        super();
        fuelTankCapacity = 0;
        mpg = 0;
    }
    public Car(String mk, String md){
        super(mk, md);
        fuelTankCapacity = 0;
        mpg = 0;
    }
    public Car(String mk, String md, double fc, double mp){
        super(mk, md);
        fuelTankCapacity = fc;
        mpg = mp;
    }
    public Car(Car c){
        super(c);
        fuelTankCapacity = c.fuelTankCapacity;
        mpg = c.mpg;
    }


    @Override
    public Addable add(Addable a) {
        if(!(a instanceof Car c)){
            throw new IllegalArgumentException("Input must be a Car");
        }
        String newMake = this.getMake();
        String newModel = this.getModel();
        if(!this.getMake().equals(c.getMake())){
            newMake = "Hybrid";
        }
        if(!this.getModel().equals(c.getModel())){
            newModel = "Hybrid";
        }
        Car resCar = new Car(newMake, newModel, this.fuelTankCapacity+c.fuelTankCapacity, (this.mpg + c.mpg)/2.0);
        return resCar;
    }

    public static Car add(Car t, Car c){
        return (Car)t.add(c);
    }

    @Override
    double getRange() {
        return fuelTankCapacity*mpg;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelTankCapacity=" + fuelTankCapacity +
                ", mpg=" + mpg +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Car car)) return false;
        if(!super.equals(car)) {
            return false;
        }
        return Double.compare(fuelTankCapacity, car.fuelTankCapacity) == 0 && Double.compare(mpg, car.mpg) == 0;
    }


}
