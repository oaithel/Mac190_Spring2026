package com.mac190.reviewfinal;
/*
- Fields: make (String), model (String)
- Constructor: parameters for make and model
- Abstract method: double getRange()
- toString() returns "VehicleType - Make: <make>, Model: <model>"
- equals(Vehicle other) compares make and model
 */
abstract class Vehicle {
    private String make, model;
    public Vehicle(){
        make = "N/A";
        model = "N/A";
    }
    public Vehicle(String mk, String md){
        make = mk;
        model = md;
    }
    public Vehicle(Vehicle V){
        make = V.make;
        model = V.model;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String toString(){
        return "VehicleType - Make: <" + make+ ">, Model: <" + model + ">";
    }
    public boolean equals(Vehicle other){
        return (this.make.equals(other.make) && this.model.equals(other.model));
    }
    abstract double getRange();
}
