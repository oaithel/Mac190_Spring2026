package com.mac190.midtermsolution;

public class Device {
    private String brand;
    private double batteryLife;
    public Device(){
        brand = "N/A";
        batteryLife = 0;
    }
    public Device(String br, double bl){
        brand = br;
        batteryLife = bl;
    }
    public Device(String br){
        brand = br;
        batteryLife = 10;
    }
    public Device(Device d){
        brand = d.brand;
        batteryLife = d.batteryLife;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getBatteryLife() {
        return batteryLife;
    }
    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }
    public double batteryUsagePerHour(){
        return (100.0/batteryLife);
    }
    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", batteryLife=" + batteryLife +
                '}';
    }
    public boolean equals(Device other){
        if(this.brand.equals(other.brand) && this.batteryLife == other.getBatteryLife()){
            return true;
        }
        return false;
    }
    public Device add(Device other){
        String newBrand = this.brand + "-" + other.brand;
        double batLife = (this.batteryLife + other.batteryLife)/2.0;
        return new Device(newBrand, batLife);
    }
    public static Device add(Device t, Device other){
        String newBrand = t.brand + "-" + other.brand;
        double batLife = (t.batteryLife + other.batteryLife)/2.0;
        return new Device(newBrand, batLife);
    }
}
