package com.mac190.midtermsolution;

public class ISmartphone extends Device{
    private int storage;

    public ISmartphone(){
        super();
        storage = 0;
    }
    public ISmartphone(Device d, int st){
        super(d);
        storage = st;
    }
    public ISmartphone(String br, int st){
        super(br);
        storage = st;
    }
    public ISmartphone(String br){
        super(br);
        storage = 0;
    }
    public ISmartphone(ISmartphone S){
       super(S.getBaseDevice());
        storage = S.storage;
    }
    public Device getBaseDevice() {
        return this;
    }
    public void setBaseDevice(Device baseDevice) {
        this.setBrand(baseDevice.getBrand());
        this.setBatteryLife(baseDevice.getBatteryLife());
    }
    public int getStorage() {
        return storage;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double efficiencyScore(){
        return storage/this.batteryUsagePerHour();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "baseDevice=" + super.toString() +
                ", storage=" + storage +
                '}';
    }
    public boolean equals(ISmartphone other){
        if(super.equals(other.getBaseDevice()) && this.storage == other.storage){
            return true;
        }
        return false;
    }
    public ISmartphone add(ISmartphone other){
        return new ISmartphone(super.add(other), (storage + other.storage)/2);
    }
    public static ISmartphone add(ISmartphone t, ISmartphone other){
        return new ISmartphone(Device.add(t.getBaseDevice(), other.getBaseDevice()), (t.storage + other.storage)/2);
    }
}
