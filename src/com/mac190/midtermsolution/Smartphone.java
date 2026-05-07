package com.mac190.midtermsolution;

public class Smartphone {
    private Device baseDevice;
    private int storage;

    public Smartphone(){
        baseDevice = new Device();
        storage = 0;
    }
    public Smartphone(Device d, int st){
        baseDevice = new Device(d);
        storage = st;
    }
    public Smartphone(String br, int st){
        baseDevice = new Device(br);
        storage = st;
    }
    public Smartphone(String br){
        baseDevice = new Device(br);
        storage = 0;
    }
    public Smartphone(Smartphone S){
        baseDevice = new Device(S.getBaseDevice());
        storage = S.storage;
    }
    public Device getBaseDevice() {
        return baseDevice;
    }
    public void setBaseDevice(Device baseDevice) {
        this.baseDevice = baseDevice;
    }
    public int getStorage() {
        return storage;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }
    public String getBrand() {
        return baseDevice.getBrand();
    }
    public void setBrand(String brand) {
        this.baseDevice.setBrand(brand);
    }
    public double getBatteryLife() {
        return baseDevice.getBatteryLife();
    }
    public void setBatteryLife(double batteryLife) {
        this.baseDevice.setBatteryLife(batteryLife);
    }
    public double efficiencyScore(){
        return storage/this.baseDevice.batteryUsagePerHour();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "baseDevice=" + baseDevice +
                ", storage=" + storage +
                '}';
    }
    public boolean equals(Smartphone other){
        if(this.baseDevice.equals(other.baseDevice) && this.storage == other.storage){
            return true;
        }
        return false;
    }
    public Smartphone add(Smartphone other){
        return new Smartphone(this.baseDevice.add(other.baseDevice), (storage + other.storage)/2);
    }
    public static Smartphone add(Smartphone t, Smartphone other){
        return new Smartphone(t.baseDevice.add(other.baseDevice), (t.storage + other.storage)/2);
    }
}
