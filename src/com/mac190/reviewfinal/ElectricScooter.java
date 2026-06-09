package com.mac190.reviewfinal;

import java.util.Objects;

public class ElectricScooter extends Vehicle implements Addable {
    private double batteryCapacity, efficiency;

    public ElectricScooter() {
        super();
        batteryCapacity = 0;
        efficiency = 0;
    }

    public ElectricScooter(String mk, String md) {
        super(mk, md);
        batteryCapacity = 0;
        efficiency = 0;
    }

    public ElectricScooter(String mk, String md, double bc, double ef) throws BatteryException {
        super(mk, md);
        if (bc <= 0) {
            throw new BatteryException("Cannot be negative");
        }
        this.batteryCapacity = bc;
        this.efficiency = ef;
    }

    public ElectricScooter(ElectricScooter e) {
        super(e);
        this.batteryCapacity = e.getBatteryCapacity();
        this.efficiency = e.getEfficiency();
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) throws BatteryException {
        if (batteryCapacity < 0) {
            throw new BatteryException("Capacity cannot be negative");
        }
        this.batteryCapacity = batteryCapacity;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }

    @Override
    public Addable add(Addable a) throws BatteryException {
        if (!(a instanceof ElectricScooter c)) {
            throw new IllegalArgumentException("Input must be a ElectricScooter");
        }
        String newMake = this.getMake();
        String newModel = this.getModel();
        if (!this.getMake().equals(c.getMake())) {
            newMake = "Mix";
        }
        if (!this.getModel().equals(c.getModel())) {
            newModel = "Mix";
        }
        ElectricScooter resCar = new ElectricScooter(newMake, newModel, this.getBatteryCapacity() + c.getBatteryCapacity(), (this.getEfficiency() + c.getEfficiency()) / 2.0);
        return resCar;
    }

    public static ElectricScooter add(ElectricScooter t, ElectricScooter c){
        try {
            return (ElectricScooter) t.add(c);
        } catch (BatteryException e) {
                throw new RuntimeException(e);
        }
    }

    @Override
    double getRange() {
        return batteryCapacity * efficiency;
    }

    @Override
    public String toString() {
        return "ElectricScooter{" +
                "batteryCapacity=" + batteryCapacity +
                ", efficiency=" + efficiency +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ElectricScooter that)) return false;
        if (!super.equals(that)) return false;
        return Double.compare(batteryCapacity, that.batteryCapacity) == 0 && Double.compare(efficiency, that.efficiency) == 0;
    }

}


